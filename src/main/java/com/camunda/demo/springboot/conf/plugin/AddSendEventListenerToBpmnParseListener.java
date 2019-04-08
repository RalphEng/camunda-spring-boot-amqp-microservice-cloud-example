package com.camunda.demo.springboot.conf.plugin;

import java.util.List;

import org.camunda.bpm.engine.impl.bpmn.parser.BpmnParseListener;
import org.camunda.bpm.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.camunda.bpm.engine.impl.pvm.PvmEvent;
import org.camunda.bpm.engine.impl.pvm.process.ActivityImpl;
import org.camunda.bpm.engine.impl.pvm.process.ScopeImpl;
import org.camunda.bpm.engine.impl.pvm.process.TransitionImpl;
import org.camunda.bpm.engine.impl.util.xml.Element;
import org.camunda.bpm.engine.impl.variable.VariableDeclaration;

/**
 * Decide on which elements to add the listener. Allows to inspect basically everything
 * that happens within Camunda.
 */
public class AddSendEventListenerToBpmnParseListener implements BpmnParseListener {

    @Override
    public void parseProcess(final Element processElement, final ProcessDefinitionEntity processDefinition) {
        processDefinition.addBuiltInListener(PvmEvent.EVENTNAME_START, new SendEventListener());
        processDefinition.addBuiltInListener(PvmEvent.EVENTNAME_END, new SendEventListener());
    }

    @Override
    public void parseIntermediateThrowEvent(final Element intermediateEventElement, final ScopeImpl scope,
            final ActivityImpl activity) {
        activity.addBuiltInListener(PvmEvent.EVENTNAME_START, new SendEventListener());
    }

    @Override
    public void parseStartEvent(final Element startEventElement, final ScopeImpl scope,
            final ActivityImpl startEventActivity) {
    }

    @Override
    public void parseExclusiveGateway(final Element exclusiveGwElement, final ScopeImpl scope,
            final ActivityImpl activity) {
    }

    @Override
    public void parseInclusiveGateway(final Element inclusiveGwElement, final ScopeImpl scope,
            final ActivityImpl activity) {
    }

    @Override
    public void parseParallelGateway(final Element parallelGwElement, final ScopeImpl scope,
            final ActivityImpl activity) {
    }

    @Override
    public void parseScriptTask(final Element scriptTaskElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseServiceTask(final Element serviceTaskElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseBusinessRuleTask(final Element businessRuleTaskElement, final ScopeImpl scope,
            final ActivityImpl activity) {
    }

    @Override
    public void parseTask(final Element taskElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseManualTask(final Element manualTaskElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseUserTask(final Element userTaskElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseEndEvent(final Element endEventElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseBoundaryTimerEventDefinition(final Element timerEventDefinition, final boolean interrupting,
            final ActivityImpl timerActivity) {
    }

    @Override
    public void parseBoundaryErrorEventDefinition(final Element errorEventDefinition, final boolean interrupting,
            final ActivityImpl activity, final ActivityImpl nestedErrorEventActivity) {
    }

    @Override
    public void parseSubProcess(final Element subProcessElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseCallActivity(final Element callActivityElement, final ScopeImpl scope,
            final ActivityImpl activity) {
    }

    @Override
    public void parseProperty(final Element propertyElement, final VariableDeclaration variableDeclaration,
            final ActivityImpl activity) {
    }

    @Override
    public void parseSequenceFlow(final Element sequenceFlowElement, final ScopeImpl scopeElement,
            final TransitionImpl transition) {
    }

    @Override
    public void parseSendTask(final Element sendTaskElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseMultiInstanceLoopCharacteristics(final Element activityElement,
            final Element multiInstanceLoopCharacteristicsElement, final ActivityImpl activity) {
    }

    @Override
    public void parseIntermediateTimerEventDefinition(final Element timerEventDefinition,
            final ActivityImpl timerActivity) {
    }

    @Override
    public void parseRootElement(final Element rootElement, final List<ProcessDefinitionEntity> processDefinitions) {
    }

    @Override
    public void parseReceiveTask(final Element receiveTaskElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseIntermediateSignalCatchEventDefinition(final Element signalEventDefinition,
            final ActivityImpl signalActivity) {
    }

    @Override
    public void parseIntermediateMessageCatchEventDefinition(final Element messageEventDefinition,
            final ActivityImpl nestedActivity) {
    }

    @Override
    public void parseBoundarySignalEventDefinition(final Element signalEventDefinition, final boolean interrupting,
            final ActivityImpl signalActivity) {
    }

    @Override
    public void parseEventBasedGateway(final Element eventBasedGwElement, final ScopeImpl scope,
            final ActivityImpl activity) {
    }

    @Override
    public void parseTransaction(final Element transactionElement, final ScopeImpl scope, final ActivityImpl activity) {
    }

    @Override
    public void parseCompensateEventDefinition(final Element compensateEventDefinition,
            final ActivityImpl compensationActivity) {
    }

    @Override
    public void parseIntermediateCatchEvent(final Element intermediateEventElement, final ScopeImpl scope,
            final ActivityImpl activity) {
    }

    @Override
    public void parseBoundaryEvent(final Element boundaryEventElement, final ScopeImpl scopeElement,
            final ActivityImpl nestedActivity) {
    }

    @Override
    public void parseBoundaryMessageEventDefinition(final Element element, final boolean interrupting,
            final ActivityImpl messageActivity) {
    }

    @Override
    public void parseBoundaryEscalationEventDefinition(final Element escalationEventDefinition,
            final boolean interrupting, final ActivityImpl boundaryEventActivity) {
    }

    @Override
    public void parseBoundaryConditionalEventDefinition(final Element element, final boolean interrupting,
            final ActivityImpl conditionalActivity) {
    }

    @Override
    public void parseIntermediateConditionalEventDefinition(final Element conditionalEventDefinition,
            final ActivityImpl conditionalActivity) {
    }

    @Override
    public void parseConditionalStartEventForEventSubprocess(final Element element,
            final ActivityImpl conditionalActivity, final boolean interrupting) {
    }

}
