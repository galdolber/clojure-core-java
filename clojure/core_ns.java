package clojure;

import clojure.lang.*;

public final class core_ns extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final java.lang.Object const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Symbol const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Symbol const__32;
 public static final clojure.lang.Symbol const__33;
 public static final clojure.lang.Symbol const__34;
 public static final clojure.lang.Symbol const__35;
 public static final clojure.lang.Symbol const__36;
 public static final clojure.lang.Symbol const__37;
 public static final clojure.lang.Symbol const__38;
 public static final clojure.lang.Symbol const__39;
 public static final clojure.lang.Symbol const__40;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "vary-meta");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "merge");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__10 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "gen-class");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__13 = (java.lang.Object)Character.valueOf((char)45);
  const__14 = (java.lang.Object)Character.valueOf((char)95);
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "impl-ns");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "main");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__22 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "in-ns");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__24 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "with-loading-context");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "not=");
  const__26 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "not-any?");
  const__28 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "refer");
  const__29 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__31 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__32 = (clojure.lang.Symbol)Symbol.intern(null, ".equals");
  const__33 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__34 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__35 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "dosync");
  const__36 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "commute");
  const__37 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "deref");
  const__38 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__39 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*loaded-libs*");
  const__40 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "conj");
 }
 public core_ns() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object references4) {
  {
   Object process_reference5 = new clojure.core_ns_process_reference__4938();
   Object __r3108;
   Object __r3109 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(references4));
   if (__r3109 != null && !(__r3109 == Boolean.FALSE)) {
    __r3108 = ((IFn)const__1.getRawRoot()).invoke(references4);
   } else {
    __r3108 = null;
   }
   Object docstring6 = __r3108;
   Object __r3110;
   Object __r3111 = docstring6;
   if (__r3111 != null && !(__r3111 == Boolean.FALSE)) {
    __r3110 = ((IFn)const__2.getRawRoot()).invoke(references4);
   } else {
    __r3110 = references4;
   }
   Object references7 = __r3110;
   Object __r3112;
   Object __r3113 = docstring6;
   if (__r3113 != null && !(__r3113 == Boolean.FALSE)) {
    __r3112 = ((IFn)const__3.getRawRoot()).invoke(name3, const__4.getRawRoot(), const__5, docstring6);
   } else {
    __r3112 = name3;
   }
   Object name8 = __r3112;
   Object __r3114;
   Object __r3115 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(references7));
   if (__r3115 != null && !(__r3115 == Boolean.FALSE)) {
    __r3114 = ((IFn)const__1.getRawRoot()).invoke(references7);
   } else {
    __r3114 = null;
   }
   Object metadata9 = __r3114;
   Object __r3116;
   Object __r3117 = metadata9;
   if (__r3117 != null && !(__r3117 == Boolean.FALSE)) {
    __r3116 = ((IFn)const__2.getRawRoot()).invoke(references7);
   } else {
    __r3116 = references7;
   }
   Object references10 = __r3116;
   Object __r3118;
   Object __r3119 = metadata9;
   if (__r3119 != null && !(__r3119 == Boolean.FALSE)) {
    __r3118 = ((IFn)const__3.getRawRoot()).invoke(name8, const__7.getRawRoot(), metadata9);
   } else {
    __r3118 = name8;
   }
   Object name11 = __r3118;
   Object gen_class_clause12 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(new clojure.core_ns_fn__4943(), references10));
   Object __r3120;
   Object __r3121 = gen_class_clause12;
   if (__r3121 != null && !(__r3121 == Boolean.FALSE)) {
    __r3120 = ((IFn)const__9.getRawRoot()).invoke(const__10, const__11, ((java.lang.String)((java.lang.String)((IFn)const__12.getRawRoot()).invoke(name11)).replace((char)((Character)const__13).charValue(), (char)((Character)const__14).charValue())), const__15, name11, const__16, Boolean.TRUE, ((IFn)const__2.getRawRoot()).invoke(gen_class_clause12));
   } else {
    __r3120 = null;
   }
   Object gen_class_call13 = __r3120;
   Object references14 = ((IFn)const__17.getRawRoot()).invoke(new clojure.core_ns_fn__4945(), references10);
   Object __r3122;
   Object __r3123 = gen_class_call13;
   if (__r3123 != null && !(__r3123 == Boolean.FALSE)) {
    __r3122 = ((IFn)const__20.getRawRoot()).invoke(gen_class_call13);
   } else {
    __r3122 = null;
   }
   Object __r3124;
   Object __r3125 = null;
   {
    Object and__3966__auto__15 = ((IFn)const__25.getRawRoot()).invoke(name11, const__26);
    Object __r3126;
    Object __r3127 = and__3966__auto__15;
    if (__r3127 != null && !(__r3127 == Boolean.FALSE)) {
     __r3126 = ((IFn)const__27.getRawRoot()).invoke(new clojure.core_ns_fn__4947(), references14);
    } else {
     __r3126 = and__3966__auto__15;
    }
    __r3125 = __r3126;
   }
   Object __r3128 = __r3125;
   if (__r3128 != null && !(__r3128 == Boolean.FALSE)) {
    __r3124 = ((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__28), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__23), ((IFn)const__20.getRawRoot()).invoke(const__29)))))))));
   } else {
    __r3124 = null;
   }
   return ((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__21), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__22), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__23), ((IFn)const__20.getRawRoot()).invoke(name11))))))), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__24), __r3122, __r3124, ((IFn)const__30.getRawRoot()).invoke(process_reference5, references14)))), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__31), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__32), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__23), ((IFn)const__20.getRawRoot()).invoke(name11)))), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__23), ((IFn)const__20.getRawRoot()).invoke(const__33))))))), ((IFn)const__20.getRawRoot()).invoke(null), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__34), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__35), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__36), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__37), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__38), ((IFn)const__20.getRawRoot()).invoke(const__39))))))), ((IFn)const__20.getRawRoot()).invoke(const__40), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__23), ((IFn)const__20.getRawRoot()).invoke(name11)))))))))), ((IFn)const__20.getRawRoot()).invoke(null)))))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
