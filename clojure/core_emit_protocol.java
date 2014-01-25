package clojure;

import clojure.lang.*;

public final class core_emit_protocol extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Keyword const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Keyword const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Symbol const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Symbol const__32;
 public static final clojure.lang.Symbol const__33;
 public static final clojure.lang.Keyword const__34;
 public static final clojure.lang.Keyword const__35;
 public static final clojure.lang.Symbol const__36;
 public static final clojure.lang.Keyword const__37;
 public static final clojure.lang.Keyword const__38;
 public static final clojure.lang.Keyword const__39;
 public static final clojure.lang.Symbol const__40;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "munge");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "namespace-munge");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (java.lang.Object)0L;
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "vals");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__14 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defonce");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "gen-interface");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "methods");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "alter-meta!");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__23 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "assoc");
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__25 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "assert-same-protocol");
  const__27 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__28 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__30 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "alter-var-root");
  const__31 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__32 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "merge");
  const__33 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "assoc");
  const__34 = (clojure.lang.Keyword)Keyword.intern(null, "sigs");
  const__35 = (clojure.lang.Keyword)Keyword.intern(null, "var");
  const__36 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__37 = (clojure.lang.Keyword)Keyword.intern(null, "method-map");
  const__38 = (clojure.lang.Keyword)Keyword.intern(null, "on");
  const__39 = (clojure.lang.Keyword)Keyword.intern(null, "method-builders");
  const__40 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "-reset-methods");
 }
 public core_emit_protocol() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object name1, java.lang.Object opts_PLUS_sigs2) {
  {
   Object iname3 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.get())), ".", ((IFn)const__2.getRawRoot()).invoke(name1)));
   Object vec__59634 = ((IFn)new clojure.core_emit_protocol_fn__5964(opts_PLUS_sigs2, iname3)).invoke();
   Object opts5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59634), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object sigs6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59634), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r3816;
   Object __r3817 = sigs6;
   if (__r3817 != null && !(__r3817 == Boolean.FALSE)) {
    __r3816 = ((IFn)const__8.getRawRoot()).invoke(new clojure.core_emit_protocol_fn__5971(name1), clojure.lang.PersistentArrayMap.EMPTY, sigs6);
   } else {
    __r3816 = null;
   }
   Object sigs7 = __r3816;
   Object meths8 = ((IFn)const__9.getRawRoot()).invoke(new clojure.core_emit_protocol_fn__5976(), ((IFn)const__10.getRawRoot()).invoke(sigs7));
   Object __r3818;
   Object __r3819 = sigs7;
   if (__r3819 != null && !(__r3819 == Boolean.FALSE)) {
    __r3818 = ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__25), ((IFn)const__13.getRawRoot()).invoke(const__26)))), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__27), ((IFn)const__13.getRawRoot()).invoke(name1)))), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__28), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(const__19, ((IFn)const__10.getRawRoot()).invoke(sigs7))))))));
   } else {
    __r3818 = null;
   }
   Object __r3820 = null;
   {
    Object and__3966__auto__9 = RT.get(opts5, Keyword.intern(null, "on"));
    Object __r3821;
    Object __r3822 = and__3966__auto__9;
    if (__r3822 != null && !(__r3822 == Boolean.FALSE)) {
     __r3821 = ((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__9.getRawRoot()).invoke(new clojure.core_emit_protocol_fn__5980(), ((IFn)const__10.getRawRoot()).invoke(sigs7)));
    } else {
     __r3821 = and__3966__auto__9;
    }
    __r3820 = __r3821;
   }
   return ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__14), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__15), ((IFn)const__13.getRawRoot()).invoke(name1), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke())))))), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__18), ((IFn)const__13.getRawRoot()).invoke(const__19), ((IFn)const__13.getRawRoot()).invoke(iname3), ((IFn)const__13.getRawRoot()).invoke(const__20), ((IFn)const__13.getRawRoot()).invoke(meths8)))), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__21), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__22), ((IFn)const__13.getRawRoot()).invoke(name1)))), ((IFn)const__13.getRawRoot()).invoke(const__23), ((IFn)const__13.getRawRoot()).invoke(const__24), ((IFn)const__13.getRawRoot()).invoke(RT.get(opts5, Keyword.intern(null, "doc")))))), ((IFn)const__13.getRawRoot()).invoke(__r3818), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__30), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__31), ((IFn)const__13.getRawRoot()).invoke(name1)))), ((IFn)const__13.getRawRoot()).invoke(const__32), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__33), ((IFn)const__13.getRawRoot()).invoke(opts5), ((IFn)const__13.getRawRoot()).invoke(const__34), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__28), ((IFn)const__13.getRawRoot()).invoke(sigs7)))), ((IFn)const__13.getRawRoot()).invoke(const__35), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__36), ((IFn)const__13.getRawRoot()).invoke(name1)))), ((IFn)const__13.getRawRoot()).invoke(const__37), ((IFn)const__13.getRawRoot()).invoke(__r3820), ((IFn)const__13.getRawRoot()).invoke(const__39), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__9.getRawRoot()).invoke(new clojure.core_emit_protocol_fn__5983(opts5, name1), ((IFn)const__10.getRawRoot()).invoke(sigs7)))))))))), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__40), ((IFn)const__13.getRawRoot()).invoke(name1)))), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__28), ((IFn)const__13.getRawRoot()).invoke(name1))))));
  }
 }
}
