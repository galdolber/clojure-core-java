package clojure;

import clojure.lang.*;

public final class edn_read extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.edn", "read");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*in*");
 }
 public edn_read() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts1, java.lang.Object stream2) {
  return ((java.lang.Object)clojure.lang.EdnReader.read((java.io.PushbackReader)((java.io.PushbackReader)stream2), (clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)opts1)));
 }
 public java.lang.Object invoke(java.lang.Object stream1) {
  return ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, stream1);
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get());
 }
}
