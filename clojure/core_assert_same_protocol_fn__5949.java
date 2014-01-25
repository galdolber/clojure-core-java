package clojure;

import clojure.lang.*;

public final class core_assert_same_protocol_fn__5949 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object protocol_var1;
 Object p9;
 Object v8;
 public core_assert_same_protocol_fn__5949(final Object protocol_var1, final Object p9, final Object v8) {
  super();
  this.protocol_var1 = protocol_var1;
  this.p9 = p9;
  this.v8 = v8;
 }
 public java.lang.Object invoke() {
  try {
   Object __r3778;
   Object __r3779 = this.p9;
   if (__r3779 != null && !(__r3779 == Boolean.FALSE)) {
    __r3778 = ((IFn)const__1.getRawRoot()).invoke("method ", ((clojure.lang.Symbol)((clojure.lang.Var)this.v8).sym), " of protocol ", ((clojure.lang.Symbol)((clojure.lang.Var)this.p9).sym));
   } else {
    __r3778 = ((IFn)const__1.getRawRoot()).invoke("function ", ((clojure.lang.Symbol)((clojure.lang.Var)this.v8).sym));
   }
   return ((IFn)const__0.getRawRoot()).invoke("Warning: protocol", this.protocol_var1, "is overwriting", __r3778);
  } finally {
   ((IFn)const__2.getRawRoot()).invoke();
  }
 }
}
