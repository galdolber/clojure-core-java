package clojure;

import clojure.lang.*;

public final class main_legacy_repl extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.IPersistentSet const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.IPersistentStack const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "split-with");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "complement");
  const__3 = (clojure.lang.IPersistentSet)PersistentHashSet.create("--");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__5 = (java.lang.Object)0L;
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__8 = (clojure.lang.Var)RT.var("clojure.main", "repl-opt");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__10 = (clojure.lang.IPersistentStack)RT.vector("-r");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
 }
 public main_legacy_repl() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object args1) {
  ((IFn)const__0.getRawRoot()).invoke("WARNING: clojure.lang.Repl is deprecated.\nInstead, use clojure.main like this:\njava -cp clojure.jar clojure.main -i init.clj -r args...");
  {
   Object vec__68392 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), args1);
   Object inits3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68392), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object vec__68404 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68392), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object sep5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68404), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object args6 = ((IFn)const__7.getRawRoot()).invoke(vec__68404, const__6);
   return ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10, args6), ((IFn)const__11.getRawRoot()).invoke(const__12.getRawRoot(), ((IFn)const__13.getRawRoot()).invoke("-i"), inits3));
  }
 }
}
