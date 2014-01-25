package clojure;

import clojure.lang.*;

public final class pprint_map_params_fn__8135 extends clojure.lang.AFunction {
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
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "special-params");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "directive");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "class");
 }
 Object def1;
 public pprint_map_params_fn__8135(final Object def1) {
  super();
  this.def1 = def1;
 }
 public java.lang.Object invoke(java.lang.Object p1__8130_SHARP_1, java.lang.Object p2__8131_SHARP_2) {
  {
   Object val3 = ((IFn)const__0.getRawRoot()).invoke(p1__8130_SHARP_1);
   Object __r5796 = null;
   {
    boolean or__3968__auto__4 = clojure.lang.Util.identical(((java.lang.Object)val3), ((java.lang.Object)null));
    Object __r5797;
    if (or__3968__auto__4) {
     __r5797 = (or__3968__auto__4 ? Boolean.TRUE : Boolean.FALSE);
    } else {
     Object __r5798 = null;
     {
      Object or__3968__auto__5 = ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), val3);
      Object __r5799;
      Object __r5800 = or__3968__auto__5;
      if (__r5800 != null && !(__r5800 == Boolean.FALSE)) {
       __r5799 = or__3968__auto__5;
      } else {
       __r5799 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(p2__8131_SHARP_2)), val3);
      }
      __r5798 = __r5799;
     }
     __r5797 = __r5798;
    }
    __r5796 = __r5797;
   }
   Object __r5801 = ((IFn)const__1.getRawRoot()).invoke(__r5796);
   if (__r5801 != null && !(__r5801 == Boolean.FALSE)) {
    return ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke("Parameter ", ((IFn)const__9.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(p2__8131_SHARP_2)), " has bad type in directive \"", RT.get(this.def1, Keyword.intern(null, "directive")), "\": ", ((IFn)const__11.getRawRoot()).invoke(val3)), ((IFn)const__6.getRawRoot()).invoke(p1__8130_SHARP_1));
   } else {
    return null;
   }
  }
 }
}
