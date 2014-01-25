package clojure;

import clojure.lang.*;

public final class pprint_pprint_defn_fn__8381 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "single-defn");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "multi-defn");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object stuff11;
 Object doc_str7;
 Object defn_sym3;
 Object defn_name4;
 Object attr_map10;
 public pprint_pprint_defn_fn__8381(final Object stuff11, final Object doc_str7, final Object defn_sym3, final Object defn_name4, final Object attr_map10) {
  super();
  this.stuff11 = stuff11;
  this.doc_str7 = doc_str7;
  this.defn_sym3 = defn_sym3;
  this.defn_name4 = defn_name4;
  this.attr_map10 = attr_map10;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0).invoke(const__1.get(), "(", null, ")");
   Object __r6075 = null;
   {
    Object format_in__8216__auto__3 = "~w ~1I~@_~w";
    Object __r6076;
    Object __r6077 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__3);
    if (__r6077 != null && !(__r6077 == Boolean.FALSE)) {
     __r6076 = ((IFn)const__3).invoke(format_in__8216__auto__3);
    } else {
     __r6076 = format_in__8216__auto__3;
    }
    Object cf__8217__auto__4 = __r6076;
    __r6075 = new clojure.pprint_pprint_defn_fn__8381_fn__8382(cf__8217__auto__4);
   }
   ((IFn)__r6075).invoke(this.defn_sym3, this.defn_name4);
   Object __r6079 = this.doc_str7;
   if (__r6079 != null && !(__r6079 == Boolean.FALSE)) {
    Object __r6080 = null;
    {
     Object format_in__8216__auto__5 = " ~_~w";
     Object __r6081;
     Object __r6082 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__5);
     if (__r6082 != null && !(__r6082 == Boolean.FALSE)) {
      __r6081 = ((IFn)const__3).invoke(format_in__8216__auto__5);
     } else {
      __r6081 = format_in__8216__auto__5;
     }
     Object cf__8217__auto__6 = __r6081;
     __r6080 = new clojure.pprint_pprint_defn_fn__8381_fn__8385(cf__8217__auto__6);
    }
    ((IFn)__r6080).invoke(this.doc_str7);
   } else {
   }
   Object __r6084 = this.attr_map10;
   if (__r6084 != null && !(__r6084 == Boolean.FALSE)) {
    Object __r6085 = null;
    {
     Object format_in__8216__auto__7 = " ~_~w";
     Object __r6086;
     Object __r6087 = ((IFn)const__2.getRawRoot()).invoke(format_in__8216__auto__7);
     if (__r6087 != null && !(__r6087 == Boolean.FALSE)) {
      __r6086 = ((IFn)const__3).invoke(format_in__8216__auto__7);
     } else {
      __r6086 = format_in__8216__auto__7;
     }
     Object cf__8217__auto__8 = __r6086;
     __r6085 = new clojure.pprint_pprint_defn_fn__8381_fn__8388(cf__8217__auto__8);
    }
    ((IFn)__r6085).invoke(this.attr_map10);
   } else {
   }
   Object __r6089 = ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(this.stuff11));
   if (__r6089 != null && !(__r6089 == Boolean.FALSE)) {
    Object __r6090 = null;
    {
     Object or__3968__auto__9 = this.doc_str7;
     Object __r6091;
     Object __r6092 = or__3968__auto__9;
     if (__r6092 != null && !(__r6092 == Boolean.FALSE)) {
      __r6091 = or__3968__auto__9;
     } else {
      __r6091 = this.attr_map10;
     }
     __r6090 = __r6091;
    }
    ((IFn)const__6.getRawRoot()).invoke(this.stuff11, __r6090);
   } else {
    Object __r6094 = const__7;
    if (__r6094 != null && !(__r6094 == Boolean.FALSE)) {
     Object __r6095 = null;
     {
      Object or__3968__auto__10 = this.doc_str7;
      Object __r6096;
      Object __r6097 = or__3968__auto__10;
      if (__r6097 != null && !(__r6097 == Boolean.FALSE)) {
       __r6096 = or__3968__auto__10;
      } else {
       __r6096 = this.attr_map10;
      }
      __r6095 = __r6096;
     }
     ((IFn)const__8.getRawRoot()).invoke(this.stuff11, __r6095);
    } else {
    }
   }
   return ((IFn)const__9).invoke(const__1.get());
  } finally {
   ((IFn)const__10.getRawRoot()).invoke();
  }
 }
}
