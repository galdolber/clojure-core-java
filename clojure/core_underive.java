package clojure;

import clojure.lang.*;

public final class core_underive extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final java.lang.Object const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "alter-var-root");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "underive");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "parents");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "disj");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "not-empty");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "dissoc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "flatten");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "make-hierarchy");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__15 = (java.lang.Object)2L;
 }
 public core_underive() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object h1, java.lang.Object tag2, java.lang.Object parent3) {
  {
   Object parentMap4 = RT.get(h1, Keyword.intern(null, "parents"));
   Object __r3096;
   Object __r3097 = ((IFn)parentMap4).invoke(tag2);
   if (__r3097 != null && !(__r3097 == Boolean.FALSE)) {
    __r3096 = ((IFn)const__4.getRawRoot()).invoke(((IFn)parentMap4).invoke(tag2), parent3);
   } else {
    __r3096 = clojure.lang.PersistentHashSet.EMPTY;
   }
   Object childsParents5 = __r3096;
   Object __r3098;
   Object __r3099 = ((IFn)const__5.getRawRoot()).invoke(childsParents5);
   if (__r3099 != null && !(__r3099 == Boolean.FALSE)) {
    __r3098 = ((IFn)const__6.getRawRoot()).invoke(parentMap4, tag2, childsParents5);
   } else {
    __r3098 = ((IFn)const__7.getRawRoot()).invoke(parentMap4, tag2);
   }
   Object newParents6 = __r3098;
   Object deriv_seq7 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(new clojure.core_underive_fn__4916(), ((IFn)const__10.getRawRoot()).invoke(newParents6)));
   Object __r3101 = ((IFn)const__11.getRawRoot()).invoke(((IFn)parentMap4).invoke(tag2), parent3);
   if (__r3101 != null && !(__r3101 == Boolean.FALSE)) {
    return ((IFn)const__12.getRawRoot()).invoke(new clojure.core_underive_fn__4918(), ((IFn)const__13.getRawRoot()).invoke(), ((IFn)const__14.getRawRoot()).invoke(const__15, deriv_seq7));
   } else {
    return h1;
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object tag1, java.lang.Object parent2) {
  ((IFn)const__0.getRawRoot()).invoke(const__1, const__2.getRawRoot(), tag1, parent2);
  return null;
 }
}
