package clojure;

import clojure.lang.*;

public final class pprint_fn__8274 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.IPersistentMap const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.IPersistentStack const__14;
 public static final clojure.lang.IPersistentMap const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "simple-dispatch");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)147;
  const__6 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 147, Keyword.intern(null, "file"), "clojure/pprint/dispatch.clj");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__8 = (java.lang.Object)clojure.lang.MultiFn.class;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__10 = (java.lang.Object)147;
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__14 = (clojure.lang.IPersistentStack)RT.vector(RT.vector(Symbol.intern(null, "object")));
  const__15 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), RT.vector(RT.vector(Symbol.intern(null, "object"))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.2", Keyword.intern(null, "doc"), "The pretty print dispatch function for simple data structure format.", Keyword.intern(null, "line"), 147, Keyword.intern(null, "file"), "clojure/pprint/dispatch.clj");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "default");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
 }
 public pprint_fn__8274() {
  super();
 }
 public java.lang.Object invoke() {
  {
   const__0.setMeta((IPersistentMap)const__6);
   Object v__4105__auto__1 = const__0;
   Object __r5974 = null;
   boolean and__3966__auto__2 = ((clojure.lang.Var)v__4105__auto__1).hasRoot();
   Object __r5975;
   if (and__3966__auto__2) {
    __r5975 = (((IFn)const__9.getRawRoot()).invoke(v__4105__auto__1) instanceof clojure.lang.MultiFn);
   } else {
    __r5975 = and__3966__auto__2;
   }
   if ((java.lang.Boolean)__r5975) {
    return null;
   } else {
    const__0.setMeta((IPersistentMap)const__15);
    const__0.bindRoot(new clojure.lang.MultiFn((java.lang.String)((java.lang.String)"simple-dispatch"), (clojure.lang.IFn)((clojure.lang.IFn)const__16.getRawRoot()), ((java.lang.Object)const__17), (clojure.lang.IRef)((clojure.lang.IRef)const__18)));
    return const__0;
   }
  }
 }
}
