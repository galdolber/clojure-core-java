package clojure.test;

import clojure.lang.*;

public final class tap_fn__7227 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.IPersistentMap const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.IPersistentMap const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.tap", "tap-report");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)72;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "dynamic");
  const__7 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 72, Keyword.intern(null, "file"), "clojure/test/tap.clj");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__9 = (java.lang.Object)clojure.lang.MultiFn.class;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__11 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 72, Keyword.intern(null, "file"), "clojure/test/tap.clj");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "default");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
 }
 public tap_fn__7227() {
  super();
 }
 public java.lang.Object invoke() {
  {
   const__0.setDynamic(true);
   const__0.setMeta((IPersistentMap)const__7);
   Object v__4105__auto__1 = const__0;
   Object __r4751 = null;
   boolean and__3966__auto__2 = ((clojure.lang.Var)v__4105__auto__1).hasRoot();
   Object __r4752;
   if (and__3966__auto__2) {
    __r4752 = (((IFn)const__10.getRawRoot()).invoke(v__4105__auto__1) instanceof clojure.lang.MultiFn);
   } else {
    __r4752 = and__3966__auto__2;
   }
   if ((java.lang.Boolean)__r4752) {
    return null;
   } else {
    const__0.setDynamic(true);
    const__0.setMeta((IPersistentMap)const__11);
    const__0.bindRoot(new clojure.lang.MultiFn((java.lang.String)((java.lang.String)"tap-report"), (clojure.lang.IFn)((clojure.lang.IFn)const__12), ((java.lang.Object)const__13), (clojure.lang.IRef)((clojure.lang.IRef)const__14)));
    return const__0;
   }
  }
 }
}
