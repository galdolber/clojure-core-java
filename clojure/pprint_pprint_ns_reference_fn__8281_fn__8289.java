package clojure;

import clojure.lang.*;

public final class pprint_pprint_ns_reference_fn__8281_fn__8289 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__4 = (java.lang.Object)3L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__8 = (java.lang.Object)0L;
  const__9 = (java.lang.Object)1L;
  const__10 = (java.lang.Object)2L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "sequential?");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object arg8;
 Object start10;
 Object end11;
 public pprint_pprint_ns_reference_fn__8281_fn__8289(final Object arg8, final Object start10, final Object end11) {
  super();
  this.arg8 = arg8;
  this.start10 = start10;
  this.end11 = end11;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0).invoke(const__1.get(), this.start10, null, this.end11);
   Object __r5979 = null;
   {
    boolean and__3966__auto__3 = clojure.lang.Util.equiv((long)clojure.lang.RT.count(((java.lang.Object)this.arg8)), (long)3L);
    Object __r5980;
    if (and__3966__auto__3) {
     __r5980 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(this.arg8));
    } else {
     __r5980 = (and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE);
    }
    __r5979 = __r5980;
   }
   Object __r5981 = __r5979;
   if (__r5981 != null && !(__r5981 == Boolean.FALSE)) {
    {
     Object vec__82904 = this.arg8;
     Object ns5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82904), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object kw6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82904), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object lis7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82904), (int)RT.intCast(2L), ((java.lang.Object)null)));
     Object __r5982 = null;
     {
      Object format_in__8216__auto__8 = "~w ~w ";
      Object __r5983;
      Object __r5984 = ((IFn)const__11.getRawRoot()).invoke(format_in__8216__auto__8);
      if (__r5984 != null && !(__r5984 == Boolean.FALSE)) {
       __r5983 = ((IFn)const__12).invoke(format_in__8216__auto__8);
      } else {
       __r5983 = format_in__8216__auto__8;
      }
      Object cf__8217__auto__9 = __r5983;
      __r5982 = new clojure.pprint_pprint_ns_reference_fn__8281_fn__8289_fn__8291(cf__8217__auto__9);
     }
     ((IFn)__r5982).invoke(ns5, kw6);
     Object __r5986 = ((IFn)const__13.getRawRoot()).invoke(lis7);
     if (__r5986 != null && !(__r5986 == Boolean.FALSE)) {
      Object __r5987 = null;
      {
       Object __r5988;
       Object __r5989 = ((IFn)const__14.getRawRoot()).invoke(lis7);
       if (__r5989 != null && !(__r5989 == Boolean.FALSE)) {
        __r5988 = "~<[~;~@{~w~^ ~:_~}~;]~:>";
       } else {
        __r5988 = "~<(~;~@{~w~^ ~:_~}~;)~:>";
       }
       Object format_in__8216__auto__10 = __r5988;
       Object __r5990;
       Object __r5991 = ((IFn)const__11.getRawRoot()).invoke(format_in__8216__auto__10);
       if (__r5991 != null && !(__r5991 == Boolean.FALSE)) {
        __r5990 = ((IFn)const__12).invoke(format_in__8216__auto__10);
       } else {
        __r5990 = format_in__8216__auto__10;
       }
       Object cf__8217__auto__11 = __r5990;
       __r5987 = new clojure.pprint_pprint_ns_reference_fn__8281_fn__8289_fn__8294(cf__8217__auto__11);
      }
      ((IFn)__r5987).invoke(lis7);
     } else {
      ((IFn)const__15.getRawRoot()).invoke(lis7);
     }
    }
   } else {
    Object __r5992 = null;
    {
     Object format_in__8216__auto__12 = "~w ~:i~@{~w~^ ~:_~}";
     Object __r5993;
     Object __r5994 = ((IFn)const__11.getRawRoot()).invoke(format_in__8216__auto__12);
     if (__r5994 != null && !(__r5994 == Boolean.FALSE)) {
      __r5993 = ((IFn)const__12).invoke(format_in__8216__auto__12);
     } else {
      __r5993 = format_in__8216__auto__12;
     }
     Object cf__8217__auto__13 = __r5993;
     __r5992 = new clojure.pprint_pprint_ns_reference_fn__8281_fn__8289_fn__8297(cf__8217__auto__13);
    }
    ((IFn)const__16.getRawRoot()).invoke(__r5992, this.arg8);
   }
   return ((IFn)const__17).invoke(const__1.get());
  } finally {
   ((IFn)const__18.getRawRoot()).invoke();
  }
 }
}
