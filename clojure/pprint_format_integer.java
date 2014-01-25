package clojure;

import clojure.lang.*;

public final class pprint_format_integer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Keyword const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Keyword const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Keyword const__26;
 public static final clojure.lang.Keyword const__27;
 public static final clojure.lang.Var const__28;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "integral?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "opt-base-str");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "group-by*");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "commainterval");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "commachar");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "mincol");
  const__22 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__24 = (clojure.lang.Var)RT.var("clojure.pprint", "format-ascii");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "print-str");
  const__26 = (clojure.lang.Keyword)Keyword.intern(null, "colinc");
  const__27 = (clojure.lang.Keyword)Keyword.intern(null, "minpad");
  const__28 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
 }
 public pprint_format_integer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object base1, java.lang.Object params2, java.lang.Object arg_navigator3, java.lang.Object offsets4) {
  {
   Object vec__76975 = ((IFn)const__0.getRawRoot()).invoke(arg_navigator3);
   Object arg6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76975), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object arg_navigator7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76975), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5118 = ((IFn)const__4.getRawRoot()).invoke(arg6);
   if (__r5118 != null && !(__r5118 == Boolean.FALSE)) {
    {
     boolean neg8 = clojure.lang.Numbers.isNeg(((java.lang.Object)arg6));
     Object __r5119;
     if (neg8) {
      __r5119 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)arg6)));
     } else {
      __r5119 = arg6;
     }
     Object pos_arg9 = __r5119;
     Object raw_str10 = ((IFn)const__7.getRawRoot()).invoke(base1, pos_arg9);
     Object __r5120;
     Object __r5121 = RT.get(params2, Keyword.intern(null, "colon"));
     if (__r5121 != null && !(__r5121 == Boolean.FALSE)) {
      Object __r5122 = null;
      {
       Object groups11 = ((IFn)const__9.getRawRoot()).invoke(new clojure.pprint_format_integer_fn__7698(), ((IFn)const__10.getRawRoot()).invoke(RT.get(params2, Keyword.intern(null, "commainterval")), raw_str10));
       Object commas12 = ((IFn)const__12.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)groups11))), RT.get(params2, Keyword.intern(null, "commachar")));
       __r5122 = ((IFn)const__15.getRawRoot()).invoke(const__16.getRawRoot(), ((IFn)const__17.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(commas12, groups11)));
      }
      __r5120 = __r5122;
     } else {
      __r5120 = raw_str10;
     }
     Object group_str13 = __r5120;
     Object __r5123;
     if (neg8) {
      __r5123 = ((IFn)const__16.getRawRoot()).invoke("-", group_str13);
     } else {
      Object __r5124;
      Object __r5125 = RT.get(params2, Keyword.intern(null, "at"));
      if (__r5125 != null && !(__r5125 == Boolean.FALSE)) {
       __r5124 = ((IFn)const__16.getRawRoot()).invoke("+", group_str13);
      } else {
       Object __r5126;
       Object __r5127 = Boolean.TRUE;
       if (__r5127 != null && !(__r5127 == Boolean.FALSE)) {
        __r5126 = group_str13;
       } else {
        __r5126 = null;
       }
       __r5124 = __r5126;
      }
      __r5123 = __r5124;
     }
     Object signed_str14 = __r5123;
     Object __r5128;
     if (clojure.lang.Numbers.lt((long)((java.lang.String)signed_str14).length(), ((java.lang.Object)RT.get(params2, Keyword.intern(null, "mincol"))))) {
      __r5128 = ((IFn)const__16.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__16.getRawRoot(), ((IFn)const__12.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)RT.get(params2, Keyword.intern(null, "mincol"))), (long)((java.lang.String)signed_str14).length())), RT.get(params2, Keyword.intern(null, "padchar")))), signed_str14);
     } else {
      __r5128 = signed_str14;
     }
     Object padded_str15 = __r5128;
     ((IFn)const__23.getRawRoot()).invoke(padded_str15);
    }
   } else {
    ((IFn)const__24.getRawRoot()).invoke(const__25.getRawRoot(), RT.mapUniqueKeys(const__21, RT.get(params2, Keyword.intern(null, "mincol")), const__26, const__3, const__27, const__2, const__22, RT.get(params2, Keyword.intern(null, "padchar")), const__19, Boolean.TRUE), ((IFn)const__28.getRawRoot()).invoke(RT.vector(arg6)), null);
   }
   return arg_navigator7;
  }
 }
}
