package clojure;

import clojure.lang.*;

public final class core_root_resource extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (java.lang.Object)Character.valueOf((char)47);
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__3 = (java.lang.Object)Character.valueOf((char)45);
  const__4 = (java.lang.Object)Character.valueOf((char)95);
  const__5 = (java.lang.Object)Character.valueOf((char)46);
 }
 public core_root_resource() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object lib1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, ((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke(lib1)).replace((char)((Character)const__3).charValue(), (char)((Character)const__4).charValue()))).replace((char)((Character)const__5).charValue(), (char)((Character)const__1).charValue())));
 }
}
