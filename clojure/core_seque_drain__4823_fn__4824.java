package clojure;

import clojure.lang.*;

public final class core_seque_drain__4823_fn__4824 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "send-off");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 Object drain0;
 Object q3;
 Object NIL4;
 Object agt5;
 Object fill7;
 public core_seque_drain__4823_fn__4824(final Object drain0, final Object q3, final Object NIL4, final Object agt5, final Object fill7) {
  super();
  this.drain0 = drain0;
  this.q3 = q3;
  this.NIL4 = NIL4;
  this.agt5 = agt5;
  this.fill7 = fill7;
 }
 public java.lang.Object invoke() {
  try {
   {
    Object x1 = ((java.lang.Object)((java.util.concurrent.BlockingQueue)this.q3).take());
    if (clojure.lang.Util.identical(((java.lang.Object)x1), ((java.lang.Object)this.q3))) {
     ((IFn)const__1.getRawRoot()).invoke(this.agt5);
     return null;
    } else {
     ((IFn)const__2.getRawRoot()).invoke(this.agt5, this.fill7);
     Object __r2951;
     if (clojure.lang.Util.identical(((java.lang.Object)x1), ((java.lang.Object)this.NIL4))) {
      __r2951 = null;
     } else {
      __r2951 = x1;
     }
     return ((IFn)const__3.getRawRoot()).invoke(__r2951, ((IFn)this.drain0).invoke());
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
