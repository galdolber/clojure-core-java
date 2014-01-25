package clojure;

import clojure.lang.*;

public final class core_update_proxy extends clojure.lang.AFunction {
 static {
 }
 public core_update_proxy() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object proxy1, java.lang.Object mappings2) {
  ((clojure.lang.IProxy)proxy1).__updateClojureFnMappings((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)mappings2));
  return proxy1;
 }
}
