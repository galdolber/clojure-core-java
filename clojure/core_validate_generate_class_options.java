package clojure;

import clojure.lang.*;

public final class core_validate_generate_class_options extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "methods");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "valid-java-method-name");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "comp");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__11 = (java.lang.Object)0L;
 }
 public core_validate_generate_class_options() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__55411) {
  {
   Object map__55422 = p__55411;
   Object __r3537;
   Object __r3538 = ((IFn)const__0.getRawRoot()).invoke(map__55422);
   if (__r3538 != null && !(__r3538 == Boolean.FALSE)) {
    __r3537 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__1.getRawRoot()).invoke(map__55422))));
   } else {
    __r3537 = map__55422;
   }
   Object map__55423 = __r3537;
   Object methods4 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__55423), ((java.lang.Object)const__3)));
   {
    Object vec__55435 = ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8.getRawRoot(), const__9.getRawRoot()), methods4));
    Object mname6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__55435), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object __r3540 = mname6;
    if (__r3540 != null && !(__r3540 == Boolean.FALSE)) {
     Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke("Not a valid method name: ", mname6))));
     return null;
    } else {
     return null;
    }
   }
  }
 }
}
