package clojure;

import clojure.lang.*;

public final class core_defmulti extends clojure.lang.RestFn {
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
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Symbol const__29;
 public static final clojure.lang.Symbol const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Var const__32;
 public static final clojure.lang.Symbol const__33;
 public static final clojure.lang.Symbol const__34;
 public static final clojure.lang.Var const__35;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (java.lang.Object)1L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "default");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "hierarchy");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "check-valid-options");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, "v__4105__auto__");
  const__24 = (clojure.lang.Symbol)Symbol.intern(null, "def");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-not");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "and");
  const__27 = (clojure.lang.Symbol)Symbol.intern(null, ".hasRoot");
  const__28 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "instance?");
  const__29 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.MultiFn");
  const__30 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "deref");
  const__31 = (clojure.lang.Symbol)Symbol.intern(null, "def");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__33 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__34 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.MultiFn");
  const__35 = (clojure.lang.Var)RT.var("clojure.core", "name");
 }
 public core_defmulti() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object mm_name3, java.lang.Object options4) {
  {
   Object __r2400;
   Object __r2401 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(options4));
   if (__r2401 != null && !(__r2401 == Boolean.FALSE)) {
    __r2400 = ((IFn)const__1.getRawRoot()).invoke(options4);
   } else {
    __r2400 = null;
   }
   Object docstring5 = __r2400;
   Object __r2402;
   Object __r2403 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(options4));
   if (__r2403 != null && !(__r2403 == Boolean.FALSE)) {
    __r2402 = ((IFn)const__2.getRawRoot()).invoke(options4);
   } else {
    __r2402 = options4;
   }
   Object options6 = __r2402;
   Object __r2404;
   Object __r2405 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(options6));
   if (__r2405 != null && !(__r2405 == Boolean.FALSE)) {
    __r2404 = ((IFn)const__1.getRawRoot()).invoke(options6);
   } else {
    __r2404 = clojure.lang.PersistentArrayMap.EMPTY;
   }
   Object m7 = __r2404;
   Object __r2406;
   Object __r2407 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(options6));
   if (__r2407 != null && !(__r2407 == Boolean.FALSE)) {
    __r2406 = ((IFn)const__2.getRawRoot()).invoke(options6);
   } else {
    __r2406 = options6;
   }
   Object options8 = __r2406;
   Object dispatch_fn9 = ((IFn)const__1.getRawRoot()).invoke(options8);
   Object options10 = ((IFn)const__2.getRawRoot()).invoke(options8);
   Object __r2408;
   Object __r2409 = docstring5;
   if (__r2409 != null && !(__r2409 == Boolean.FALSE)) {
    __r2408 = ((IFn)const__4.getRawRoot()).invoke(m7, const__5, docstring5);
   } else {
    __r2408 = m7;
   }
   Object m11 = __r2408;
   Object __r2410;
   Object __r2411 = ((IFn)const__6.getRawRoot()).invoke(mm_name3);
   if (__r2411 != null && !(__r2411 == Boolean.FALSE)) {
    __r2410 = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(mm_name3), m11);
   } else {
    __r2410 = m11;
   }
   Object m12 = __r2410;
   if (clojure.lang.Util.equiv((long)clojure.lang.RT.count(((java.lang.Object)options10)), (long)1L)) {
    Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"The syntax for defmulti has changed. Example: (defmulti name dispatch-fn :default dispatch-value)")));
   } else {
   }
   {
    Object options13 = ((IFn)const__11.getRawRoot()).invoke(const__12.getRawRoot(), options10);
    Object default14 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)options13), ((java.lang.Object)const__14), ((java.lang.Object)const__14)));
    Object hierarchy15 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)options13), ((java.lang.Object)const__15), ((java.lang.Object)const__16)));
    ((IFn)const__17.getRawRoot()).invoke(options13, const__14, const__15);
    return ((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__21), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__22.getRawRoot(), ((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__23), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__24), ((IFn)const__20.getRawRoot()).invoke(mm_name3)))))))), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__25), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__26), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__27), ((IFn)const__20.getRawRoot()).invoke(const__23)))), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__28), ((IFn)const__20.getRawRoot()).invoke(const__29), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__30), ((IFn)const__20.getRawRoot()).invoke(const__23)))))))))), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__31), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__32.getRawRoot()).invoke(mm_name3, m12)), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__33), ((IFn)const__20.getRawRoot()).invoke(const__34), ((IFn)const__20.getRawRoot()).invoke(((IFn)const__35.getRawRoot()).invoke(mm_name3)), ((IFn)const__20.getRawRoot()).invoke(dispatch_fn9), ((IFn)const__20.getRawRoot()).invoke(default14), ((IFn)const__20.getRawRoot()).invoke(hierarchy15))))))))))));
   }
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
