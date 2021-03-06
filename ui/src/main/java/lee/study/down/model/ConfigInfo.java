package lee.study.down.model;

import com.github.monkeywie.proxyee.proxy.ProxyConfig;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ConfigInfo extends ConfigBaseInfo {

  private ProxyConfig secProxyConfig; //二级代理设置
}
