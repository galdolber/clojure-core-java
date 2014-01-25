package clojure;

import clojure.lang.*;

public final class edn_read_string extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.IPersistentMap const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.edn", "read-string");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "eof");
  const__2 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "eof"), null);
 }
 public edn_read_string() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts1, java.lang.Object s2) {
  Object __r4516 = s2;
  if (__r4516 != null && !(__r4516 == Boolean.FALSE)) {
   return ((java.lang.Object)clojure.lang.EdnReader.readString((java.lang.String)((java.lang.String)s2), (clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)opts1)));
  } else {
   return null;
  }
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__2, s1);
 }
}
