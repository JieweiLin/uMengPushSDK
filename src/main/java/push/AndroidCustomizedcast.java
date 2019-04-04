/** 
* All rights Reserved, Designed By www.szy.cn
* @Title: AndroidCustomizedcast.java
* @author: 掌通家园
* @date: 2019/4/2 15:46
* @Copyright: 2014-现在 All rights reserved. 厦门神州鹰软件科技有限公司
*/
package push;

public class AndroidCustomizedcast extends AndroidNotification {
    public AndroidCustomizedcast(String appkey, String appMasterSecret) throws Exception {
        setAppMasterSecret(appMasterSecret);
        setPredefinedKeyValue("appkey", appkey);
        this.setPredefinedKeyValue("type", "customizedcast");
    }

    public void setAlias(String alias, String aliasType) throws Exception {
        setPredefinedKeyValue("alias", alias);
        setPredefinedKeyValue("alias_type", aliasType);
    }

    public void setFileId(String fileId, String aliasType) throws Exception {
        setPredefinedKeyValue("file_id", fileId);
        setPredefinedKeyValue("alias_type", aliasType);
    }

}
