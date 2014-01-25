package clojure;

import clojure.lang.*;

public final class core__cache_protocol_fn extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "find-protocol-method");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "var");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "expand-method-impl-cache");
 }
 public core__cache_protocol_fn() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pf1, java.lang.Object x2, java.lang.Object c3, java.lang.Object interf4) {
  {
   Object cache5 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)pf1).__methodImplCache);
   Object __r3766;
   if (((java.lang.Class)c3).isInstance(((java.lang.Object)x2))) {
    __r3766 = interf4;
   } else {
    __r3766 = ((IFn)const__0.getRawRoot()).invoke(((clojure.lang.IPersistentMap)((clojure.lang.MethodImplCache)cache5).protocol), ((clojure.lang.Keyword)((clojure.lang.MethodImplCache)cache5).methodk), x2);
   }
   Object f6 = __r3766;
   Object __r3768 = f6;
   if (__r3768 != null && !(__r3768 == Boolean.FALSE)) {
   } else {
    Object __r3769;
    if (clojure.lang.Util.identical(((java.lang.Object)x2), ((java.lang.Object)null))) {
     __r3769 = "nil";
    } else {
     __r3769 = ((java.lang.String)((java.lang.Class)((IFn)const__4.getRawRoot()).invoke(x2)).getName());
    }
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("No implementation of method: ", ((clojure.lang.Keyword)((clojure.lang.MethodImplCache)cache5).methodk), " of protocol: ", RT.get(((clojure.lang.IPersistentMap)((clojure.lang.MethodImplCache)cache5).protocol), Keyword.intern(null, "var")), " found for class: ", __r3769))));
   }
   ((clojure.lang.AFunction)pf1).__methodImplCache = (clojure.lang.MethodImplCache)((IFn)const__5.getRawRoot()).invoke(cache5, ((IFn)const__4.getRawRoot()).invoke(x2), f6);
   return f6;
  }
 }
}
