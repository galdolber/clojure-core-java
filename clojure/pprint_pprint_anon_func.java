package clojure;

import clojure.lang.*;

public final class pprint_pprint_anon_func extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "*symbol-map*");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__8 = (java.lang.Object)1L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-simple-code-list");
 }
 public pprint_pprint_anon_func() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1) {
  {
   Object args2 = ((IFn)const__0.getRawRoot()).invoke(alis1);
   Object nlis3 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(alis1)));
   Object __r6173 = ((IFn)const__3.getRawRoot()).invoke(args2);
   if (__r6173 != null && !(__r6173 == Boolean.FALSE)) {
    {
     Object __r6174;
     if (clojure.lang.Util.equiv((long)1L, (long)clojure.lang.RT.count(((java.lang.Object)args2)))) {
      __r6174 = RT.mapUniqueKeys(((IFn)const__1.getRawRoot()).invoke(args2), "%");
     } else {
      __r6174 = ((IFn)const__10.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__11.getRawRoot()).invoke(new clojure.pprint_pprint_anon_func_fn__8450(), args2, ((IFn)const__12.getRawRoot()).invoke(const__8, Numbers.num(clojure.lang.Numbers.inc((long)clojure.lang.RT.count(((java.lang.Object)args2)))))));
     }
     ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6, __r6174));
     try {
      Object __r6175 = null;
      {
       Object format_in__8216__auto__6 = "~<#(~;~@{~w~^ ~_~}~;)~:>";
       Object __r6176;
       Object __r6177 = ((IFn)const__14.getRawRoot()).invoke(format_in__8216__auto__6);
       if (__r6177 != null && !(__r6177 == Boolean.FALSE)) {
        __r6176 = ((IFn)const__15).invoke(format_in__8216__auto__6);
       } else {
        __r6176 = format_in__8216__auto__6;
       }
       Object cf__8217__auto__7 = __r6176;
       __r6175 = new clojure.pprint_pprint_anon_func_fn__8452(cf__8217__auto__7);
      }
      return ((IFn)__r6175).invoke(nlis3);
     } finally {
      ((IFn)const__16.getRawRoot()).invoke();
     }
    }
   } else {
    return ((IFn)const__17.getRawRoot()).invoke(alis1);
   }
  }
 }
}
