package clojure;

import clojure.lang.*;

public final class pprint_map_params extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
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
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "check-flags");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "params");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "cl-format");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "directive");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "doall");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "merge");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "array-map");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "reverse");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "keys");
 }
 public pprint_map_params() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object def1, java.lang.Object params2, java.lang.Object flags3, java.lang.Object offset4) {
  ((IFn)const__0.getRawRoot()).invoke(def1, flags3);
  if (clojure.lang.Numbers.gt((long)clojure.lang.RT.count(((java.lang.Object)params2)), (long)clojure.lang.RT.count(((java.lang.Object)RT.get(def1, Keyword.intern(null, "params")))))) {
   ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(null, "Too many parameters for directive \"~C\": ~D~:* ~[were~;was~:;were~] specified but only ~D~:* ~[are~;is~:;are~] allowed", RT.get(def1, Keyword.intern(null, "directive")), Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)params2))), Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)RT.get(def1, Keyword.intern(null, "params")))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(params2)));
  } else {
  }
  ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(new clojure.pprint_map_params_fn__8135(def1), params2, RT.get(def1, Keyword.intern(null, "params"))));
  Object __r5810 = null;
  {
   Object iter__4618__auto__5 = new clojure.pprint_map_params_iter__8139__8143(offset4);
   __r5810 = ((IFn)iter__4618__auto__5).invoke(RT.get(def1, Keyword.intern(null, "params")));
  }
  return ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(), ((IFn)const__14.getRawRoot()).invoke(__r5810)), ((IFn)const__15.getRawRoot()).invoke(new clojure.pprint_map_params_fn__8156(), clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__16.getRawRoot()).invoke(new clojure.pprint_map_params_fn__8158(), ((IFn)const__17.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(RT.get(def1, Keyword.intern(null, "params"))), params2))), flags3);
 }
}
