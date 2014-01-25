package clojure.core;

import clojure.lang.*;

public final class VecSeq_fn__6158 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "bit-and");
  const__1 = (java.lang.Object)31L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 Object result3;
 Object node5;
 Object am;
 long aidx4;
 Object f1;
 public VecSeq_fn__6158(final Object result3, final Object node5, final Object am, final long aidx4, final Object f1) {
  super();
  this.result3 = result3;
  this.node5 = node5;
  this.am = am;
  this.aidx4 = aidx4;
  this.f1 = f1;
 }
 public java.lang.Object invoke() {
  {
   Object result1 = this.result3;
   long node_idx2 = clojure.lang.Numbers.and((long)31L, (long)aidx4);
   while(true) {
    if (clojure.lang.Numbers.lt((long)node_idx2, (long)((clojure.core.ArrayManager)this.am).alength(((java.lang.Object)this.node5)))) {
     java.lang.Object result1___aux = ((IFn)this.f1).invoke(result1, ((java.lang.Object)((clojure.core.ArrayManager)this.am).aget(((java.lang.Object)this.node5), (int)RT.intCast(node_idx2))));
     long node_idx2___aux = clojure.lang.Numbers.inc((long)node_idx2);
     result1 = result1___aux;
     node_idx2 = node_idx2___aux;
     continue;
    } else {
     return result1;
    }
   }
  }
 }
}
