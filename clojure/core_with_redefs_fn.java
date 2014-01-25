package clojure;

import clojure.lang.*;

public final class core_with_redefs_fn extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_with_redefs_fn() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object binding_map1, java.lang.Object func2) {
  {
   Object root_bind3 = new clojure.core_with_redefs_fn_root_bind__6550();
   Object old_vals4 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(binding_map1), ((IFn)const__2.getRawRoot()).invoke(new clojure.core_with_redefs_fn_fn__6560(), ((IFn)const__1.getRawRoot()).invoke(binding_map1)));
   try {
    ((IFn)root_bind3).invoke(binding_map1);
    return ((IFn)func2).invoke();
   } finally {
    ((IFn)root_bind3).invoke(old_vals4);
   }
  }
 }
}
