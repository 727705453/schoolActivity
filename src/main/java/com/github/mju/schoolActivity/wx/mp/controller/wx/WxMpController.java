package com.github.mju.schoolActivity.wx.mp.controller.wx;

import com.github.mju.schoolActivity.wx.mp.config.WxMpConfiguration;
import com.github.mju.schoolActivity.wx.mp.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 微信网页受权权限相关的内容
 */
@Controller
@RequestMapping("/wx/mp/{appid}")
@Slf4j
public class WxMpController {

    /**
     * @return 获取授权地址
     */
    @GetMapping("/authorize")
    public String authorize(@PathVariable String appid) {
        WxMpService wxMpService = WxMpConfiguration.getMpServices().get(appid);
        // 微信回调地址
        String url = "http://wx.zhaoxuebang.com/wx/mp/"+appid+"/userInfo";
        // 构造网页授权url
        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_USERINFO, null);
        log.info("【微信网页授权】获取授权地址，redirectUrl = {}", redirectUrl);

        return "redirect:" + redirectUrl;
    }

    /**
     * 获取授权用户信息
     *
     * @return
     */
    @GetMapping("/userInfo")
    public String userInfo(@PathVariable String appid, String code,ModelMap map) {
        // 指定重定向的网页
        String redirectUrl = "";

        WxMpService wxMpService = WxMpConfiguration.getMpServices().get(appid);
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = null;
        try {
            // 使用code换取access_token信息
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);

            // 获取用户信息
            WxMpUser wxMpUser = wxMpService.oauth2getUserInfo(wxMpOAuth2AccessToken, null);
            map.addAttribute("user",wxMpUser);
            log.info("【微信网页授权】获取用户信息，{}",JsonUtils.toJson(wxMpUser));

        } catch (WxErrorException e) {
            log.error("【微信网页授权】异常，{}", e);
            throw new NullPointerException("微信网页授权异常");
        }
        // 从access_token信息中获取到用户的openid
        String openId = wxMpOAuth2AccessToken.getOpenId();
        log.info("【微信网页授权】获取openId，openId = {}", openId);

        return "index";
    }

}
