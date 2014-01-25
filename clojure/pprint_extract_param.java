package clojure;

import clojure.lang.*;

public final class pprint_extract_param extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (java.lang.Object)2L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "re-matcher");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "param-pattern");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "re-find");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "re-groups");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__13 = (java.lang.Object)Character.valueOf((char)44);
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
 }
 public pprint_extract_param() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__81101) {
  {
   Object vec__81112 = p__81101;
   Object s3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81112), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object offset4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81112), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object saw_comma5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81112), (int)RT.intCast(2L), ((java.lang.Object)null)));
   {
    Object m6 = ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), s3);
    Object param7 = ((IFn)const__6.getRawRoot()).invoke(m6);
    Object __r5753 = param7;
    if (__r5753 != null && !(__r5753 == Boolean.FALSE)) {
     {
      Object token_str8 = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(m6));
      Object remainder9 = ((IFn)const__9.getRawRoot()).invoke(s3, Integer.valueOf(((java.util.regex.Matcher)m6).end()));
      Object new_offset10 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)offset4), (long)((java.util.regex.Matcher)m6).end()));
      Object __r5755 = ((IFn)const__11.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)const__13), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)remainder9), (int)RT.intCast(0L))))) ? Boolean.TRUE : Boolean.FALSE));
      if (__r5755 != null && !(__r5755 == Boolean.FALSE)) {
       return RT.vector(RT.vector(token_str8, offset4), RT.vector(remainder9, new_offset10, Boolean.FALSE));
      } else {
       return RT.vector(RT.vector(token_str8, offset4), RT.vector(((IFn)const__9.getRawRoot()).invoke(remainder9, const__2), ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)new_offset10))), Boolean.TRUE));
      }
     }
    } else {
     Object __r5757 = saw_comma5;
     if (__r5757 != null && !(__r5757 == Boolean.FALSE)) {
      return ((IFn)const__15.getRawRoot()).invoke("Badly formed parameters in format directive", offset4);
     } else {
      return RT.vector(null, RT.vector(s3, offset4));
     }
    }
   }
  }
 }
}
