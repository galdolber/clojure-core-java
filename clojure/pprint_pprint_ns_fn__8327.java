package clojure;

import clojure.lang.*;

public final class pprint_pprint_ns_fn__8327 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "cl-format");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-ns-reference");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object references11;
 Object ns_name4;
 Object ns_sym3;
 Object attr_map10;
 Object doc_str7;
 public pprint_pprint_ns_fn__8327(final Object references11, final Object ns_name4, final Object ns_sym3, final Object attr_map10, final Object doc_str7) {
  super();
  this.references11 = references11;
  this.ns_name4 = ns_name4;
  this.ns_sym3 = ns_sym3;
  this.attr_map10 = attr_map10;
  this.doc_str7 = doc_str7;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0).invoke(const__1.get(), "(", null, ")");
   Object __r6021 = null;
   {
    Object format_in__8216__auto__3 = "~w ~1I~@_~w";
    Object __r6022;
    Object __r6023 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__3);
    if (__r6023 != null && !(__r6023 == Boolean.FALSE)) {
     __r6022 = ((IFn)const__3).invoke(format_in__8216__auto__3);
    } else {
     __r6022 = format_in__8216__auto__3;
    }
    Object cf__8217__auto__4 = __r6022;
    __r6021 = new clojure.pprint_pprint_ns_fn__8327_fn__8328(cf__8217__auto__4);
   }
   ((IFn)__r6021).invoke(this.ns_sym3, this.ns_name4);
   Object __r6025 = null;
   {
    Object or__3968__auto__5 = this.doc_str7;
    Object __r6026;
    Object __r6027 = or__3968__auto__5;
    if (__r6027 != null && !(__r6027 == Boolean.FALSE)) {
     __r6026 = or__3968__auto__5;
    } else {
     Object __r6028 = null;
     {
      Object or__3968__auto__6 = this.attr_map10;
      Object __r6029;
      Object __r6030 = or__3968__auto__6;
      if (__r6030 != null && !(__r6030 == Boolean.FALSE)) {
       __r6029 = or__3968__auto__6;
      } else {
       __r6029 = ((IFn)const__4.getRawRoot()).invoke(this.references11);
      }
      __r6028 = __r6029;
     }
     __r6026 = __r6028;
    }
    __r6025 = __r6026;
   }
   Object __r6031 = __r6025;
   if (__r6031 != null && !(__r6031 == Boolean.FALSE)) {
    Object __r6032 = null;
    {
     Object format_in__8216__auto__7 = "~@:_";
     Object __r6033;
     Object __r6034 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__7);
     if (__r6034 != null && !(__r6034 == Boolean.FALSE)) {
      __r6033 = ((IFn)const__3).invoke(format_in__8216__auto__7);
     } else {
      __r6033 = format_in__8216__auto__7;
     }
     Object cf__8217__auto__8 = __r6033;
     __r6032 = new clojure.pprint_pprint_ns_fn__8327_fn__8331(cf__8217__auto__8);
    }
    ((IFn)__r6032).invoke();
   } else {
   }
   Object __r6036 = this.doc_str7;
   if (__r6036 != null && !(__r6036 == Boolean.FALSE)) {
    Object __r6037 = null;
    {
     Object or__3968__auto__9 = this.attr_map10;
     Object __r6038;
     Object __r6039 = or__3968__auto__9;
     if (__r6039 != null && !(__r6039 == Boolean.FALSE)) {
      __r6038 = or__3968__auto__9;
     } else {
      __r6038 = ((IFn)const__4.getRawRoot()).invoke(this.references11);
     }
     __r6037 = __r6038;
    }
    ((IFn)const__5.getRawRoot()).invoke(Boolean.TRUE, "\"~a\"~:[~;~:@_~]", this.doc_str7, __r6037);
   } else {
   }
   Object __r6041 = this.attr_map10;
   if (__r6041 != null && !(__r6041 == Boolean.FALSE)) {
    Object __r6042 = null;
    {
     Object format_in__8216__auto__10 = "~w~:[~;~:@_~]";
     Object __r6043;
     Object __r6044 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__10);
     if (__r6044 != null && !(__r6044 == Boolean.FALSE)) {
      __r6043 = ((IFn)const__3).invoke(format_in__8216__auto__10);
     } else {
      __r6043 = format_in__8216__auto__10;
     }
     Object cf__8217__auto__11 = __r6043;
     __r6042 = new clojure.pprint_pprint_ns_fn__8327_fn__8334(cf__8217__auto__11);
    }
    ((IFn)__r6042).invoke(this.attr_map10, ((IFn)const__4.getRawRoot()).invoke(this.references11));
   } else {
   }
   {
    Object references12 = this.references11;
    while(true) {
     ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(references12));
     {
      Object temp__4117__auto__13 = ((IFn)const__8.getRawRoot()).invoke(references12);
      Object __r6046 = temp__4117__auto__13;
      if (__r6046 != null && !(__r6046 == Boolean.FALSE)) {
       {
        Object references14 = temp__4117__auto__13;
        ((IFn)const__9.getRawRoot()).invoke(const__10);
        java.lang.Object references12___aux = references14;
        references12 = references12___aux;
        continue;
       }
      } else {
      }
     }
     break;
    }
   }
   return ((IFn)const__11).invoke(const__1.get());
  } finally {
   ((IFn)const__12.getRawRoot()).invoke();
  }
 }
}
