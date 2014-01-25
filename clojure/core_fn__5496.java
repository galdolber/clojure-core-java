package clojure;

import clojure.lang.*;

public final class core_fn__5496 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-sequential");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__4 = (java.lang.Object)clojure.lang.Agent.class;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "agent-error");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__8 = (java.lang.Object)clojure.lang.IPending.class;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "pending");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public core_fn__5496() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  Object __r3486;
  Object __r3487 = null;
  {
   boolean and__3966__auto__3 = (o1 instanceof clojure.lang.Agent);
   Object __r3488;
   if (and__3966__auto__3) {
    __r3488 = ((IFn)const__5.getRawRoot()).invoke(o1);
   } else {
    __r3488 = (and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE);
   }
   __r3487 = __r3488;
  }
  Object __r3489 = __r3487;
  if (__r3489 != null && !(__r3489 == Boolean.FALSE)) {
   __r3486 = " FAILED";
  } else {
   __r3486 = "";
  }
  Object __r3490;
  Object __r3491 = null;
  {
   boolean and__3966__auto__4 = (o1 instanceof clojure.lang.IPending);
   Object __r3492;
   if (and__3966__auto__4) {
    __r3492 = ((IFn)const__9.getRawRoot()).invoke((((clojure.lang.IPending)o1).isRealized() ? Boolean.TRUE : Boolean.FALSE));
   } else {
    __r3492 = (and__3966__auto__4 ? Boolean.TRUE : Boolean.FALSE);
   }
   __r3491 = __r3492;
  }
  Object __r3493 = __r3491;
  if (__r3493 != null && !(__r3493 == Boolean.FALSE)) {
   __r3490 = const__10;
  } else {
   __r3490 = ((IFn)const__11.getRawRoot()).invoke(o1);
  }
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke("#<%s@%x%s: ", ((java.lang.String)((java.lang.Class)((IFn)const__2.getRawRoot()).invoke(o1)).getSimpleName()), Integer.valueOf(java.lang.System.identityHashCode(((java.lang.Object)o1))), __r3486), const__6.getRawRoot(), "", ">", ((IFn)const__7.getRawRoot()).invoke(__r3490), w2);
 }
}
