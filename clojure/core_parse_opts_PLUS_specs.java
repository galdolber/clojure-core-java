package clojure;

import clojure.lang.*;

public final class core_parse_opts_PLUS_specs extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.IPersistentSet const__18;
 public static final clojure.lang.Var const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "parse-opts");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "parse-impls");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "disj");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "Object");
  const__11 = (clojure.lang.Symbol)Symbol.intern(null, "java.lang.Object");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "vals");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "no-print");
  const__18 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "no-print"));
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "print-str");
 }
 public core_parse_opts_PLUS_specs() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts_PLUS_specs1) {
  {
   Object vec__57602 = ((IFn)const__0.getRawRoot()).invoke(opts_PLUS_specs1);
   Object opts3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57602), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object specs4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57602), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object impls5 = ((IFn)const__4.getRawRoot()).invoke(specs4);
   Object interfaces6 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(new clojure.core_parse_opts_PLUS_specs_fn__5761(), ((IFn)const__9.getRawRoot()).invoke(impls5))), const__10, const__11));
   Object methods7 = ((IFn)const__8.getRawRoot()).invoke(new clojure.core_parse_opts_PLUS_specs_fn__5764(), ((IFn)const__12.getRawRoot()).invoke(const__13.getRawRoot(), ((IFn)const__14.getRawRoot()).invoke(impls5)));
   {
    Object temp__4117__auto__8 = ((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__18, ((IFn)const__9.getRawRoot()).invoke(opts3)));
    Object __r3711 = temp__4117__auto__8;
    if (__r3711 != null && !(__r3711 == Boolean.FALSE)) {
     {
      Object bad_opts9 = temp__4117__auto__8;
      Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__12.getRawRoot()).invoke(const__19.getRawRoot(), "Unsupported option(s) -", bad_opts9))));
     }
    } else {
    }
   }
   return RT.vector(interfaces6, methods7, opts3);
  }
 }
}
