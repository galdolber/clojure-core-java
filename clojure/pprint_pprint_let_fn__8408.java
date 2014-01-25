package clojure;

import clojure.lang.*;

public final class pprint_pprint_let_fn__8408 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-binding-form");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-simple-code-list");
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object alis1;
 Object base_sym2;
 public pprint_pprint_let_fn__8408(final Object alis1, final Object base_sym2) {
  super();
  this.alis1 = alis1;
  this.base_sym2 = base_sym2;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0).invoke(const__1.get(), "(", null, ")");
   Object __r6122 = null;
   {
    Object and__3966__auto__3 = ((IFn)const__2.getRawRoot()).invoke(this.alis1);
    Object __r6123;
    Object __r6124 = and__3966__auto__3;
    if (__r6124 != null && !(__r6124 == Boolean.FALSE)) {
     __r6123 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.alis1));
    } else {
     __r6123 = and__3966__auto__3;
    }
    __r6122 = __r6123;
   }
   Object __r6125 = __r6122;
   if (__r6125 != null && !(__r6125 == Boolean.FALSE)) {
    Object __r6126 = null;
    {
     Object format_in__8216__auto__4 = "~w ~1I~@_";
     Object __r6127;
     Object __r6128 = ((IFn)const__5.getRawRoot()).invoke(format_in__8216__auto__4);
     if (__r6128 != null && !(__r6128 == Boolean.FALSE)) {
      __r6127 = ((IFn)const__6).invoke(format_in__8216__auto__4);
     } else {
      __r6127 = format_in__8216__auto__4;
     }
     Object cf__8217__auto__5 = __r6127;
     __r6126 = new clojure.pprint_pprint_let_fn__8408_fn__8409(cf__8217__auto__5);
    }
    ((IFn)__r6126).invoke(this.base_sym2);
    ((IFn)const__7.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.alis1));
    Object __r6129 = null;
    {
     Object format_in__8216__auto__6 = " ~_~{~w~^ ~_~}";
     Object __r6130;
     Object __r6131 = ((IFn)const__5.getRawRoot()).invoke(format_in__8216__auto__6);
     if (__r6131 != null && !(__r6131 == Boolean.FALSE)) {
      __r6130 = ((IFn)const__6).invoke(format_in__8216__auto__6);
     } else {
      __r6130 = format_in__8216__auto__6;
     }
     Object cf__8217__auto__7 = __r6130;
     __r6129 = new clojure.pprint_pprint_let_fn__8408_fn__8412(cf__8217__auto__7);
    }
    ((IFn)__r6129).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this.alis1)));
   } else {
    ((IFn)const__9.getRawRoot()).invoke(this.alis1);
   }
   return ((IFn)const__10).invoke(const__1.get());
  } finally {
   ((IFn)const__11.getRawRoot()).invoke();
  }
 }
}
