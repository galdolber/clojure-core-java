package clojure.test;

import clojure.lang.*;

public final class junit_package_class extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__3 = (java.lang.Object)1L;
 }
 public junit_package_class() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object name1) {
  {
   Object i2 = Reflector.invokeInstanceMethod(name1, "lastIndexOf", new Object[]{"."});
   if (clojure.lang.Numbers.lt(((java.lang.Object)i2), (long)0L)) {
    return RT.vector(null, name1);
   } else {
    return RT.vector(Reflector.invokeInstanceMethod(name1, "substring", new Object[]{const__1, i2}), Reflector.invokeInstanceMethod(name1, "substring", new Object[]{((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)i2), (long)1L))}));
   }
  }
 }
}
