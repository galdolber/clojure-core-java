package clojure;

import clojure.lang.*;

public final class core_fn__4439 extends clojure.lang.AFunction {
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
 public static final clojure.lang.IPersistentMap const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)3341;
  const__6 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 3341, Keyword.intern(null, "file"), "clojure/core.clj");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__8 = (java.lang.Object)clojure.lang.MultiFn.class;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__10 = (java.lang.Object)3341;
  const__11 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 3341, Keyword.intern(null, "file"), "clojure/core.clj");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "default");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
 }
 public core_fn__4439() {
  super();
 }
 public java.lang.Object invoke() {
  {
   const__0.setMeta((IPersistentMap)const__6);
   Object v__4105__auto__1 = const__0;
   Object __r2693 = null;
   boolean and__3966__auto__2 = ((clojure.lang.Var)v__4105__auto__1).hasRoot();
   Object __r2694;
   if (and__3966__auto__2) {
    __r2694 = (((IFn)const__9.getRawRoot()).invoke(v__4105__auto__1) instanceof clojure.lang.MultiFn);
   } else {
    __r2694 = and__3966__auto__2;
   }
   if ((java.lang.Boolean)__r2694) {
    return null;
   } else {
    const__0.setMeta((IPersistentMap)const__11);
    const__0.bindRoot(new clojure.lang.MultiFn((java.lang.String)((java.lang.String)"print-method"), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_fn__4439_fn__4440()), ((java.lang.Object)const__12), (clojure.lang.IRef)((clojure.lang.IRef)const__13)));
    return const__0;
   }
  }
 }
}
