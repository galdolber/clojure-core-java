package clojure;

import clojure.lang.*;

public final class core_sort_by_fn__4325 extends clojure.lang.AFunction {
 static {
 }
 Object keyfn1;
 Object comp2;
 public core_sort_by_fn__4325(final Object keyfn1, final Object comp2) {
  super();
  this.keyfn1 = keyfn1;
  this.comp2 = comp2;
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return Integer.valueOf(((java.util.Comparator)this.comp2).compare(((java.lang.Object)((IFn)this.keyfn1).invoke(x1)), ((java.lang.Object)((IFn)this.keyfn1).invoke(y2))));
 }
}
