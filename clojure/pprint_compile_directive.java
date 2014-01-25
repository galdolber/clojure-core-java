package clojure;

import clojure.lang.*;

public final class pprint_compile_directive extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final java.lang.Object const__21;
 public static final clojure.lang.Keyword const__22;
 public static final clojure.lang.Keyword const__23;
 public static final clojure.lang.Var const__24;
 public static final java.lang.Object const__25;
 public static final java.lang.Object const__26;
 public static final clojure.lang.IPersistentStack const__27;
 public static final clojure.lang.Var const__28;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "extract-params");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "extract-flags");
  const__5 = (java.lang.Object)2L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "directive-table");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "map-params");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "translate-param");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "compiled-directive");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "generator-fn");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__21 = (java.lang.Object)Character.valueOf((char)10);
  const__22 = (clojure.lang.Keyword)Keyword.intern(null, "directive");
  const__23 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__24 = (clojure.lang.Var)RT.var("clojure.pprint", "prefix-count");
  const__25 = (java.lang.Object)Character.valueOf((char)32);
  const__26 = (java.lang.Object)Character.valueOf((char)9);
  const__27 = (clojure.lang.IPersistentStack)RT.vector(Character.valueOf((char)32), Character.valueOf((char)9));
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "+");
 }
 public pprint_compile_directive() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object offset2) {
  {
   Object vec__81623 = ((IFn)const__0.getRawRoot()).invoke(s1, offset2);
   Object raw_params4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81623), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object vec__81635 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81623), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object rest6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81635), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object offset7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81635), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object vec__81648 = ((IFn)const__4.getRawRoot()).invoke(rest6, offset7);
   Object _9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81648), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object vec__816510 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81648), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object rest11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__816510), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object offset12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__816510), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object flags13 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__816510), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object directive14 = ((IFn)const__6.getRawRoot()).invoke(rest11);
   Object def15 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)const__8.getRawRoot()), ((java.lang.Object)Character.valueOf(java.lang.Character.toUpperCase((char)((Character)directive14).charValue())))));
   Object __r5811;
   Object __r5812 = def15;
   if (__r5812 != null && !(__r5812 == Boolean.FALSE)) {
    __r5811 = ((IFn)const__9.getRawRoot()).invoke(def15, ((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), raw_params4), flags13, offset12);
   } else {
    __r5811 = null;
   }
   Object params16 = __r5811;
   Object __r5814 = ((IFn)const__12.getRawRoot()).invoke(directive14);
   if (__r5814 != null && !(__r5814 == Boolean.FALSE)) {
    ((IFn)const__13.getRawRoot()).invoke("Format string ended in the middle of a directive", offset12);
   } else {
   }
   Object __r5816 = ((IFn)const__12.getRawRoot()).invoke(def15);
   if (__r5816 != null && !(__r5816 == Boolean.FALSE)) {
    ((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke("Directive \"", directive14, "\" is undefined"), offset12);
   } else {
   }
   Object __r5817 = null;
   {
    Object remainder17 = ((IFn)const__18.getRawRoot()).invoke(rest11, const__3);
    Object offset18 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)offset12)));
    Object __r5818 = null;
    {
     boolean and__3966__auto__19 = clojure.lang.Util.equiv(((java.lang.Object)const__21), ((java.lang.Object)RT.get(def15, Keyword.intern(null, "directive"))));
     Object __r5819;
     if (and__3966__auto__19) {
      __r5819 = ((IFn)const__12.getRawRoot()).invoke(RT.get(params16, Keyword.intern(null, "colon")));
     } else {
      __r5819 = (and__3966__auto__19 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r5818 = __r5819;
    }
    Object trim_QMARK_20 = __r5818;
    Object __r5820;
    Object __r5821 = trim_QMARK_20;
    if (__r5821 != null && !(__r5821 == Boolean.FALSE)) {
     __r5820 = ((IFn)const__24.getRawRoot()).invoke(remainder17, const__27);
    } else {
     __r5820 = const__2;
    }
    Object trim_count21 = __r5820;
    Object remainder22 = ((IFn)const__18.getRawRoot()).invoke(remainder17, trim_count21);
    Object offset23 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)offset18), ((java.lang.Object)trim_count21)));
    __r5817 = RT.vector(remainder22, offset23);
   }
   return RT.vector(((IFn)const__15.getRawRoot()).invoke(const__16.getRawRoot(), ((IFn)RT.get(def15, Keyword.intern(null, "generator-fn"))).invoke(params16, offset12), def15, params16, offset12), __r5817);
  }
 }
}
