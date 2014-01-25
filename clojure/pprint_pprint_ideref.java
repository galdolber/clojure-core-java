package clojure;

import clojure.lang.*;

public final class pprint_pprint_ideref extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "map-ref-type");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__4 = (java.lang.Object)clojure.lang.Agent.class;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "agent-error");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__13 = (java.lang.Object)0L;
 }
 public pprint_pprint_ideref() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1) {
  try {
   {
    Object __r5957;
    Object __r5958 = null;
    {
     boolean and__3966__auto__2 = (o1 instanceof clojure.lang.Agent);
     Object __r5959;
     if (and__3966__auto__2) {
      __r5959 = ((IFn)const__5.getRawRoot()).invoke(o1);
     } else {
      __r5959 = (and__3966__auto__2 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r5958 = __r5959;
    }
    Object __r5960 = __r5958;
    if (__r5960 != null && !(__r5960 == Boolean.FALSE)) {
     __r5957 = " FAILED";
    } else {
     __r5957 = "";
    }
    Object prefix3 = ((IFn)const__0.getRawRoot()).invoke("#<%s@%x%s: ", ((IFn)const__1.getRawRoot()).invoke(((java.lang.String)((java.lang.Class)((IFn)const__2.getRawRoot()).invoke(o1)).getSimpleName())), Integer.valueOf(java.lang.System.identityHashCode(((java.lang.Object)o1))), __r5957);
    Object __r5962 = ((IFn)const__6).invoke();
    if (__r5962 != null && !(__r5962 == Boolean.FALSE)) {
     ((java.io.Writer)const__7.get()).write((java.lang.String)((java.lang.String)"#"));
    } else {
     ((IFn)const__8.getRawRoot()).invoke(RT.map(const__9, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__11.getRawRoot()).invoke(const__9)))), const__12, const__13));
     ((IFn)new clojure.pprint_pprint_ideref_fn__8259(o1, prefix3)).invoke();
    }
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
