package clojure;

import clojure.lang.*;

public final class pprint_pprint extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "pretty-writer?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "make-pretty-writer");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-right-margin*");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-miser-width*");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-pretty*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__11 = (java.lang.Object)0L;
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "prn");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public pprint_pprint() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object object1, java.lang.Object writer2) {
  {
   Object base_writer__7617__auto__3 = writer2;
   Object new_writer__7618__auto__4 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(base_writer__7617__auto__3));
   {
    Object __r5032;
    Object __r5033 = new_writer__7618__auto__4;
    if (__r5033 != null && !(__r5033 == Boolean.FALSE)) {
     __r5032 = ((IFn)const__6.getRawRoot()).invoke(base_writer__7617__auto__3, const__7.get(), const__8.get());
    } else {
     __r5032 = base_writer__7617__auto__3;
    }
    ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__1, __r5032));
    try {
     {
      ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__9, Boolean.TRUE));
      ((IFn)new clojure.pprint_pprint_fn__7634(object1)).invoke();
     }
     Object __r5035 = ((IFn)const__2.getRawRoot()).invoke((clojure.lang.Util.equiv((long)0L, ((java.lang.Object)((IFn)const__12.getRawRoot()).invoke(const__1.get()))) ? Boolean.TRUE : Boolean.FALSE));
     if (__r5035 != null && !(__r5035 == Boolean.FALSE)) {
      ((IFn)const__13.getRawRoot()).invoke();
     } else {
     }
     return Reflector.invokeNoArgInstanceMember(const__1.get(), "ppflush");
    } finally {
     ((IFn)const__14.getRawRoot()).invoke();
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object object1) {
  return ((IFn)const__0.getRawRoot()).invoke(object1, const__1.get());
 }
}
