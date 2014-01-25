package clojure;

import clojure.lang.*;

public final class pprint_pprint_fn__7634 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-base*");
  const__3 = (java.lang.Object)10L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-radix*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "pr-with-base");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object object1;
 public pprint_pprint_fn__7634(final Object object1) {
  super();
  this.object1 = object1;
 }
 public java.lang.Object invoke() {
  try {
   Object __r5027;
   Object __r5028 = null;
   {
    Object or__3968__auto__3 = ((IFn)const__0.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)const__2.get()), (long)10L) ? Boolean.TRUE : Boolean.FALSE));
    Object __r5029;
    Object __r5030 = or__3968__auto__3;
    if (__r5030 != null && !(__r5030 == Boolean.FALSE)) {
     __r5029 = or__3968__auto__3;
    } else {
     __r5029 = const__4.get();
    }
    __r5028 = __r5029;
   }
   Object __r5031 = __r5028;
   if (__r5031 != null && !(__r5031 == Boolean.FALSE)) {
    __r5027 = RT.mapUniqueKeys(const__5, const__6.getRawRoot());
   } else {
    __r5027 = clojure.lang.PersistentArrayMap.EMPTY;
   }
   clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)__r5027));
   try {
    return ((IFn)const__7.getRawRoot()).invoke(this.object1);
   } finally {
    clojure.lang.Var.popThreadBindings();
   }
  } finally {
   ((IFn)const__8.getRawRoot()).invoke();
  }
 }
}
