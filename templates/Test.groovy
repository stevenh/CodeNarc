/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codenarc.rule.${ruleCategory}

import org.codenarc.rule.Rule
import org.junit.jupiter.api.Test
import org.codenarc.rule.AbstractRuleTestCase

/**
 * Tests for ${ruleName}Rule
 *
 * @author ${authorName}
 */
class ${ruleName}RuleTest extends AbstractRuleTestCase<${ruleName}Rule> {

    @Test
    void RuleProperties() {
        assert rule.priority == 3
        assert rule.name == '$ruleName'
    }

    @Test
    void SomeCondition_NoViolations() {
        final SOURCE = '''
            // todo: replace with source for passing edge case(s)
        '''
        assertNoViolations(SOURCE)
    }

    @Test
    void SomeCondition_Violations() {
        final SOURCE = '''
            // todo: replace with source that triggers 2 violations
        '''
        assertViolations(SOURCE,
            [line:1, source:'...', message:'...'],    // todo: replace line number, source line and message
            [line:1, source:'...', message:'...'])    // todo: replace line number, source line and message
    }

    @Override
    protected ${ruleName}Rule createRule() {
        new ${ruleName}Rule()
    }
}
