package clojure;

import clojure.lang.*;

public final class pprint_update_nl_state_fn__7512 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "intra-block-nl");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "done-nl");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "parent");
 }
 Object lb1;
 public pprint_update_nl_state_fn__7512(final Object lb1) {
  super();
  this.lb1 = lb1;
 }
 public java.lang.Object invoke() {
  ((IFn)const__0.getRawRoot()).invoke(RT.get(this.lb1, Keyword.intern(null, "intra-block-nl")), Boolean.FALSE);
  ((IFn)const__0.getRawRoot()).invoke(RT.get(this.lb1, Keyword.intern(null, "done-nl")), Boolean.TRUE);
  {
   Object lb1 = RT.get(this.lb1, Keyword.intern(null, "parent"));
   while(true) {
    Object __r4925 = lb1;
    if (__r4925 != null && !(__r4925 == Boolean.FALSE)) {
     ((IFn)const__0.getRawRoot()).invoke(RT.get(lb1, Keyword.intern(null, "done-nl")), Boolean.TRUE);
     ((IFn)const__0.getRawRoot()).invoke(RT.get(lb1, Keyword.intern(null, "intra-block-nl")), Boolean.TRUE);
     java.lang.Object lb1___aux = RT.get(lb1, Keyword.intern(null, "parent"));
     lb1 = lb1___aux;
     continue;
    } else {
     return null;
    }
   }
  }
 }
}
