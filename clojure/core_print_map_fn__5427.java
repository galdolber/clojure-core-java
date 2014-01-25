package clojure;

import clojure.lang.*;

public final class core_print_map_fn__5427 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__1 = (java.lang.Object)Character.valueOf((char)32);
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "val");
 }
 Object print_one2;
 public core_print_map_fn__5427(final Object print_one2) {
  super();
  this.print_one2 = print_one2;
 }
 public java.lang.Object invoke(java.lang.Object e1, java.lang.Object w2) {
  try {
   ((IFn)this.print_one2).invoke(((IFn)const__0.getRawRoot()).invoke(e1), w2);
   ((java.io.Writer)w2).append((char)((Character)const__1).charValue());
   return ((IFn)this.print_one2).invoke(((IFn)const__2.getRawRoot()).invoke(e1), w2);
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
