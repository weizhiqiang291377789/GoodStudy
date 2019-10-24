/*
package com.example.messageBoard.entity;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chargelink.constant.AppKeDongUrl;
import com.chargelink.entry.ResponseMsgDataVo;
import com.chargelink.util.HttpUtil;
import com.chargelink.util.PropertiesUtils;
import com.chargelink.util.SessionUtils;
import com.chargelink.util.XXTEA;

 * 版本更新
 * xiaojun


@Controller
@RequestMapping("/check")
public class UpdateCheckController {
	public static String versionCode =PropertiesUtils.getValue("versionCode");
	public static String versionName = PropertiesUtils.getValue("versionName");
	public static String content = "";
	public static String isForceUpdate = PropertiesUtils.getValue("isForceUpdate");
	public static String url = AppKeDongUrl.CHECKUPDATE;
	
	public static String reqUrl = AppKeDongUrl.GETMD5BYFILE;
	
	@Value("${xxtea.secretkey}")
	private String secret;

	@RequestMapping(value="/api/checkUpdate",method=RequestMethod.GET)
	@ResponseBody
	public ResponseMsgDataVo<?> checkUpdate(HttpServletRequest request)throws Exception {
		// String device= request.getHeader("device");
		// 从header中取出device,并判断device是否为空
		UpdateData update = new UpdateData();
		JSONObject data = null;
		String onlineVer=SessionUtils.getVer(request);
		//兼容老版本的ios：以前版本传参：ver=x.x.x 232版本以后：ver=232
		int ver=231;
		if(!onlineVer.contains(".")){
			ver=Integer.parseInt(onlineVer);
		}

		int newVer = Integer.parseInt(versionCode);
		if ("android".equals(SessionUtils.getClient(request))) {
			url = AppKeDongUrl.CHECKUPDATE;
			//content = PropertiesUtil.getInstance().loadAccountConfig().getProperty("content");
			content = new String(PropertiesUtils.getValue("content").getBytes("ISO8859-1"),"GBK");
			//isForceUpdate = PropertiesUtil.getInstance().loadAccountConfig().getProperty("isForceUpdate");
			isForceUpdate = PropertiesUtils.getValue("isForceUpdate");
			// 比较APP端VER的值与当前版本号的大小,VER大,则是最新版本
			if (ver >= newVer) {
				return ResponseMsgDataVo.success6();
			}
			// 若APP端不是当前版本,则返回UpdateData对象
			String result = HttpUtil.doPost(reqUrl, null, "UTF-8");
			JSONObject obj = new JSONObject().fromObject(result);

			if(obj.containsKey("data")){
				data = obj.getJSONObject("data");
			}
			if(data != null && !data.equals("")){
				String md5Str = data.get("MD5").toString();
				if(!md5Str.equals("") && md5Str != null)
				{
					md5Str = XXTEA.encryptToBase64String(md5Str,secret);
				}
				update.setMd5(md5Str);
			}
		}else if("ios".equals(SessionUtils.getClient(request))){
			//String iosversionCode = PropertiesUtil.getInstance().loadAccountConfig().getProperty("iosversionCode");
			String iosversionCode = PropertiesUtils.getValue("iosversionCode");
			newVer = Integer.parseInt(iosversionCode);
			// 比较APP端VER的值与当前版本号的大小,VER大,则是最新版本
			if (ver >= newVer) {
				return ResponseMsgDataVo.success6();
			}
			url="";
			content=new String(PropertiesUtils.getValue("iosContent").getBytes("ISO8859-1"),"GBK");
			isForceUpdate=PropertiesUtils.getValue("isIosForceUpdate");
		}

		update.setContent(content);
		update.setIsForceUpdate(isForceUpdate);
		update.setUrl(url);
		update.setVersionCode(versionCode);
		update.setVersionName(versionName);
		return ResponseMsgDataVo.success7(update);

	}
}
*/
