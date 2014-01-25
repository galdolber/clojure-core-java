package clojure;

import clojure.lang.*;

public final class core_$ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (java.lang.Object)1L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__7 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "objc-class");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "even?");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__13 = (java.lang.Object)2L;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Selector.");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Selector.");
 }
 public core_$() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object args3) {
  {
   boolean is_class4 = clojure.lang.Util.equiv((long)1L, (long)clojure.lang.RT.count(((java.lang.Object)args3)));
   Object t5 = ((IFn)const__3.getRawRoot()).invoke(args3);
   if (is_class4) {
    return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__8), ((IFn)const__6.getRawRoot()).invoke(t5))))));
   } else {
    {
     Object args6 = ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(args3));
     Object has_params7 = ((IFn)const__11.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)args6))));
     Object __r4336;
     Object __r4337 = has_params7;
     if (__r4337 != null && !(__r4337 == Boolean.FALSE)) {
      __r4336 = args6;
     } else {
      __r4336 = ((IFn)const__14.getRawRoot()).invoke(args6, null);
     }
     Object args8 = ((IFn)const__12.getRawRoot()).invoke(const__13, __r4336);
     Object params9 = ((IFn)const__15.getRawRoot()).invoke(const__16.getRawRoot(), args8);
     Object __r4338;
     Object __r4339 = has_params7;
     if (__r4339 != null && !(__r4339 == Boolean.FALSE)) {
      __r4338 = ":";
     } else {
      __r4338 = "";
     }
     Object selector10 = ((IFn)const__17.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(const__3.getRawRoot(), args8)), const__1), __r4338);
     Object __r4341 = has_params7;
     if (__r4341 != null && !(__r4341 == Boolean.FALSE)) {
      return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__20), ((IFn)const__6.getRawRoot()).invoke(selector10)))), ((IFn)const__6.getRawRoot()).invoke(t5), params9));
     } else {
      return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__21), ((IFn)const__6.getRawRoot()).invoke(selector10)))), ((IFn)const__6.getRawRoot()).invoke(t5)));
     }
    }
   }
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
