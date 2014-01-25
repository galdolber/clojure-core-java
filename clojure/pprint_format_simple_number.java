package clojure;

import clojure.lang.*;

public final class pprint_format_simple_number extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "integer?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-base*");
  const__3 = (java.lang.Object)10L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-radix*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "special-radix-markers");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "opt-base-str");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public pprint_format_simple_number() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  Object __r5065 = ((IFn)const__0.getRawRoot()).invoke(n1);
  if (__r5065 != null && !(__r5065 == Boolean.FALSE)) {
   if (clojure.lang.Util.equiv(((java.lang.Object)const__2.get()), (long)10L)) {
    Object __r5067;
    Object __r5068 = const__5.get();
    if (__r5068 != null && !(__r5068 == Boolean.FALSE)) {
     __r5067 = ".";
    } else {
     __r5067 = null;
    }
    return ((IFn)const__4.getRawRoot()).invoke(n1, __r5067);
   } else {
    Object __r5069;
    Object __r5070 = const__5.get();
    if (__r5070 != null && !(__r5070 == Boolean.FALSE)) {
     Object __r5071 = null;
     {
      Object or__3968__auto__2 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)const__7.getRawRoot()), ((java.lang.Object)const__2.get())));
      Object __r5072;
      Object __r5073 = or__3968__auto__2;
      if (__r5073 != null && !(__r5073 == Boolean.FALSE)) {
       __r5072 = or__3968__auto__2;
      } else {
       __r5072 = ((IFn)const__4.getRawRoot()).invoke("#", const__2.get(), "r");
      }
      __r5071 = __r5072;
     }
     __r5069 = __r5071;
    } else {
     __r5069 = null;
    }
    return ((IFn)const__4.getRawRoot()).invoke(__r5069, ((IFn)const__8.getRawRoot()).invoke(const__2.get(), n1));
   }
  } else {
   Object __r5075 = ((IFn)const__9.getRawRoot()).invoke(n1);
   if (__r5075 != null && !(__r5075 == Boolean.FALSE)) {
    Object __r5076;
    Object __r5077 = const__5.get();
    if (__r5077 != null && !(__r5077 == Boolean.FALSE)) {
     Object __r5078 = null;
     {
      Object or__3968__auto__3 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)const__7.getRawRoot()), ((java.lang.Object)const__2.get())));
      Object __r5079;
      Object __r5080 = or__3968__auto__3;
      if (__r5080 != null && !(__r5080 == Boolean.FALSE)) {
       __r5079 = or__3968__auto__3;
      } else {
       __r5079 = ((IFn)const__4.getRawRoot()).invoke("#", const__2.get(), "r");
      }
      __r5078 = __r5079;
     }
     __r5076 = __r5078;
    } else {
     __r5076 = null;
    }
    return ((IFn)const__4.getRawRoot()).invoke(__r5076, ((IFn)const__8.getRawRoot()).invoke(const__2.get(), Reflector.invokeNoArgInstanceMember(n1, "numerator")), "/", ((IFn)const__8.getRawRoot()).invoke(const__2.get(), Reflector.invokeNoArgInstanceMember(n1, "denominator")));
   } else {
    Object __r5082 = const__10;
    if (__r5082 != null && !(__r5082 == Boolean.FALSE)) {
     return null;
    } else {
     return null;
    }
   }
  }
 }
}
