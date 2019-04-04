/** 
* All rights Reserved, Designed By www.szy.cn
* @Title: IOSUnicast.java
* @author: 掌通家园
* @date: 2019/4/2 16:04
* @Copyright: 2014-现在 All rights reserved. 厦门神州鹰软件科技有限公司
*/
package push;

public class IOSUnicast extends IOSNotification {
	public IOSUnicast(String appkey,String appMasterSecret) throws Exception{
			setAppMasterSecret(appMasterSecret);
			setPredefinedKeyValue("appkey", appkey);
			this.setPredefinedKeyValue("type", "unicast");	
	}
	
	public void setDeviceToken(String token) throws Exception {
    	setPredefinedKeyValue("device_tokens", token);
    }
}
