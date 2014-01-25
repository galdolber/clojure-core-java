package clojure;

import clojure.lang.*;

public final class pprint_write_fn__7626 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object object1;
 public pprint_write_fn__7626(final Object object1) {
  super();
  this.object1 = object1;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0.getRawRoot()).invoke(this.object1);
   return Reflector.invokeNoArgInstanceMember(const__1.get(), "ppflush");
  } finally {
   ((IFn)const__2.getRawRoot()).invoke();
  }
 }
}
