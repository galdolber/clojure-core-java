package clojure;

import clojure.lang.*;

public final class pprint_compile_raw_string extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "compiled-directive");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "string");
 }
 public pprint_compile_raw_string() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object offset2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), new clojure.pprint_compile_raw_string_fn__8168(s1), null, RT.mapUniqueKeys(const__2, s1), offset2);
 }
}
