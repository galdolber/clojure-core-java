package clojure;

import clojure.lang.*;

public final class core_build_positional_factory extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Symbol const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.IPersistentStack const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Symbol const__29;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "->");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "split-at");
  const__4 = (java.lang.Object)20L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (java.lang.Object)0L;
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__15 = (clojure.lang.IPersistentStack)RT.vector(Symbol.intern(null, "&"), Symbol.intern(null, "overage"));
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "=");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "count");
  const__19 = (clojure.lang.Symbol)Symbol.intern(null, "overage");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "throw");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.ArityException.");
  const__24 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "+");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "count");
  const__26 = (clojure.lang.Symbol)Symbol.intern(null, "overage");
  const__27 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "name");
  const__28 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__29 = (clojure.lang.Symbol)Symbol.intern(null, "new");
 }
 public core_build_positional_factory() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object nom1, java.lang.Object classname2, java.lang.Object fields3) {
  {
   Object fn_name4 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, nom1));
   Object vec__58595 = ((IFn)const__3.getRawRoot()).invoke(const__4, fields3);
   Object field_args6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58595), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object over7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58595), (int)RT.intCast(1L), ((java.lang.Object)null)));
   int field_count8 = clojure.lang.RT.count(((java.lang.Object)fields3));
   int arg_count9 = clojure.lang.RT.count(((java.lang.Object)field_args6));
   int over_count10 = clojure.lang.RT.count(((java.lang.Object)over7));
   Object docstring11 = ((IFn)const__1.getRawRoot()).invoke("Positional factory function for class ", classname2, ".");
   Object __r3731;
   Object __r3732 = ((IFn)const__9.getRawRoot()).invoke(over7);
   if (__r3732 != null && !(__r3732 == Boolean.FALSE)) {
    __r3731 = const__15;
   } else {
    __r3731 = clojure.lang.PersistentVector.EMPTY;
   }
   Object __r3733;
   Object __r3734 = ((IFn)const__9.getRawRoot()).invoke(over7);
   if (__r3734 != null && !(__r3734 == Boolean.FALSE)) {
    Object __r3735 = null;
    {
     Object iter__4618__auto__12 = new clojure.core_build_positional_factory_iter__5860__5864();
     __r3735 = ((IFn)iter__4618__auto__12).invoke(((IFn)const__21.getRawRoot()).invoke(const__6, Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)over7)))));
    }
    __r3733 = ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__16), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__17), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__18), ((IFn)const__11.getRawRoot()).invoke(const__19)))), ((IFn)const__11.getRawRoot()).invoke(Integer.valueOf(over_count10))))), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__20), ((IFn)const__11.getRawRoot()).invoke(classname2), field_args6, __r3735))), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__22), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__23), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__24), ((IFn)const__11.getRawRoot()).invoke(Integer.valueOf(arg_count9)), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__25), ((IFn)const__11.getRawRoot()).invoke(const__26))))))), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__27), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__28), ((IFn)const__11.getRawRoot()).invoke(fn_name4)))))))))))))));
   } else {
    __r3733 = ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__29), ((IFn)const__11.getRawRoot()).invoke(classname2), field_args6));
   }
   return ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__12), ((IFn)const__11.getRawRoot()).invoke(fn_name4), ((IFn)const__11.getRawRoot()).invoke(docstring11), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(field_args6, __r3731)))), ((IFn)const__11.getRawRoot()).invoke(__r3733)));
  }
 }
}
