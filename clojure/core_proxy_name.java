package clojure;

import clojure.lang.*;

public final class core_proxy_name extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "sorted-set");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__6 = (java.lang.Object)Character.valueOf((char)45);
  const__7 = (java.lang.Object)Character.valueOf((char)95);
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "hash");
 }
 public core_proxy_name() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object super1, java.lang.Object interfaces2) {
  {
   Object inames3 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(), ((IFn)const__2.getRawRoot()).invoke(new clojure.core_proxy_name_fn__5184(), interfaces2));
   return ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((java.lang.String)((java.lang.String)((IFn)const__4.getRawRoot()).invoke(const__5.get())).replace((char)((Character)const__6).charValue(), (char)((Character)const__7).charValue())), ".proxy", ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke("$"), ((IFn)const__10.getRawRoot()).invoke(RT.vector(((java.lang.String)((java.lang.Class)super1).getName())), ((IFn)const__2.getRawRoot()).invoke(new clojure.core_proxy_name_fn__5186(), inames3), RT.vector(((java.lang.String)java.lang.Integer.toHexString((int)RT.intCast(((IFn)const__11.getRawRoot()).invoke(inames3))))))));
  }
 }
}
