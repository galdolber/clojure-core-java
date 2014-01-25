package clojure;

import clojure.lang.*;

public final class core_assert_same_protocol_fn__5951 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object protocol_var1;
 Object p17;
 Object v16;
 public core_assert_same_protocol_fn__5951(final Object protocol_var1, final Object p17, final Object v16) {
  super();
  this.protocol_var1 = protocol_var1;
  this.p17 = p17;
  this.v16 = v16;
 }
 public java.lang.Object invoke() {
  try {
   Object __r3780;
   Object __r3781 = this.p17;
   if (__r3781 != null && !(__r3781 == Boolean.FALSE)) {
    __r3780 = ((IFn)const__1.getRawRoot()).invoke("method ", ((clojure.lang.Symbol)((clojure.lang.Var)this.v16).sym), " of protocol ", ((clojure.lang.Symbol)((clojure.lang.Var)this.p17).sym));
   } else {
    __r3780 = ((IFn)const__1.getRawRoot()).invoke("function ", ((clojure.lang.Symbol)((clojure.lang.Var)this.v16).sym));
   }
   return ((IFn)const__0.getRawRoot()).invoke("Warning: protocol", this.protocol_var1, "is overwriting", __r3780);
  } finally {
   ((IFn)const__2.getRawRoot()).invoke();
  }
 }
}
