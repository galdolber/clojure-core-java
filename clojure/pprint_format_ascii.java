package clojure;

import clojure.lang.*;

public final class pprint_format_ascii extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "format-simple-number");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "minpad");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "mincol");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "quot");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "colinc");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "print");
 }
 public pprint_format_ascii() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object print_func1, java.lang.Object params2, java.lang.Object arg_navigator3, java.lang.Object offsets4) {
  {
   Object vec__76785 = ((IFn)const__0.getRawRoot()).invoke(arg_navigator3);
   Object arg6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76785), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object arg_navigator7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76785), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5083 = null;
   {
    Object or__3968__auto__8 = ((IFn)const__4.getRawRoot()).invoke(arg6);
    Object __r5084;
    Object __r5085 = or__3968__auto__8;
    if (__r5085 != null && !(__r5085 == Boolean.FALSE)) {
     __r5084 = or__3968__auto__8;
    } else {
     __r5084 = ((IFn)print_func1).invoke(arg6);
    }
    __r5083 = __r5084;
   }
   Object base_output9 = __r5083;
   int base_width10 = ((java.lang.String)base_output9).length();
   Object min_width11 = ((java.lang.Number)clojure.lang.Numbers.add((long)base_width10, ((java.lang.Object)RT.get(params2, Keyword.intern(null, "minpad")))));
   Object __r5086;
   if (clojure.lang.Numbers.gte(((java.lang.Object)min_width11), ((java.lang.Object)RT.get(params2, Keyword.intern(null, "mincol"))))) {
    __r5086 = min_width11;
   } else {
    __r5086 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)min_width11), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.multiply(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)RT.get(params2, Keyword.intern(null, "mincol"))), ((java.lang.Object)min_width11)))), (long)1L))), ((java.lang.Object)RT.get(params2, Keyword.intern(null, "colinc")))))), (long)1L))), ((java.lang.Object)RT.get(params2, Keyword.intern(null, "colinc"))))))));
   }
   Object width12 = __r5086;
   Object chars13 = ((IFn)const__13.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)width12), (long)base_width10)), RT.get(params2, Keyword.intern(null, "padchar"))));
   Object __r5088 = RT.get(params2, Keyword.intern(null, "at"));
   if (__r5088 != null && !(__r5088 == Boolean.FALSE)) {
    ((IFn)const__18.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(chars13, base_output9));
   } else {
    ((IFn)const__18.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(base_output9, chars13));
   }
   return arg_navigator7;
  }
 }
}
