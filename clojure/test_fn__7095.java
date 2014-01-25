package clojure;

import clojure.lang.*;

public final class test_fn__7095 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.IPersistentMap const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.IPersistentMap const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Var const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "report");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)326;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "dynamic");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__9 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Generic reporting function, may be overridden to plug in\n    different report formats (e.g., TAP, JUnit).  Assertions such as\n    'is' call 'report' to indicate results.  The argument given to\n    'report' will be a map with a :type key.  See the documentation at\n    the top of test_is.clj for more information on the types of\n    arguments for 'report'.", Keyword.intern(null, "line"), 326, Keyword.intern(null, "file"), "clojure/test.clj");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__11 = (java.lang.Object)clojure.lang.MultiFn.class;
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__13 = (java.lang.Object)326;
  const__14 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Generic reporting function, may be overridden to plug in\n    different report formats (e.g., TAP, JUnit).  Assertions such as\n    'is' call 'report' to indicate results.  The argument given to\n    'report' will be a map with a :type key.  See the documentation at\n    the top of test_is.clj for more information on the types of\n    arguments for 'report'.", Keyword.intern(null, "line"), 326, Keyword.intern(null, "file"), "clojure/test.clj");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "default");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
 }
 public test_fn__7095() {
  super();
 }
 public java.lang.Object invoke() {
  {
   const__0.setDynamic(true);
   const__0.setMeta((IPersistentMap)const__9);
   Object v__4105__auto__1 = const__0;
   Object __r4669 = null;
   boolean and__3966__auto__2 = ((clojure.lang.Var)v__4105__auto__1).hasRoot();
   Object __r4670;
   if (and__3966__auto__2) {
    __r4670 = (((IFn)const__12.getRawRoot()).invoke(v__4105__auto__1) instanceof clojure.lang.MultiFn);
   } else {
    __r4670 = and__3966__auto__2;
   }
   if ((java.lang.Boolean)__r4670) {
    return null;
   } else {
    const__0.setDynamic(true);
    const__0.setMeta((IPersistentMap)const__14);
    const__0.bindRoot(new clojure.lang.MultiFn((java.lang.String)((java.lang.String)"report"), (clojure.lang.IFn)((clojure.lang.IFn)const__15), ((java.lang.Object)const__16), (clojure.lang.IRef)((clojure.lang.IRef)const__17)));
    return const__0;
   }
  }
 }
}
