package clojure;

import clojure.lang.*;

public final class core_accessor extends clojure.lang.AFunction {
 static {
 }
 public core_accessor() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object key2) {
  return ((clojure.lang.IFn)clojure.lang.PersistentStructMap.getAccessor((clojure.lang.PersistentStructMap.Def)((clojure.lang.PersistentStructMap.Def)s1), ((java.lang.Object)key2)));
 }
}
